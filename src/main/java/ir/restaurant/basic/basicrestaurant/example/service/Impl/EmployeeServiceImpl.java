package ir.restaurant.basic.basicrestaurant.example.service.Impl;

import ir.restaurant.basic.basicrestaurant.example.entity.employee.AccountBankEntity;
import ir.restaurant.basic.basicrestaurant.example.entity.employee.EmployeeEntity;
import ir.restaurant.basic.basicrestaurant.example.mapper.IAccountBankMapper;
import ir.restaurant.basic.basicrestaurant.example.mapper.IEmployeeMapper;
import ir.restaurant.basic.basicrestaurant.example.model.AccountBankModel;
import ir.restaurant.basic.basicrestaurant.example.model.EmployeeModel;
import ir.restaurant.basic.basicrestaurant.example.repository.AccountBankRepository;
import ir.restaurant.basic.basicrestaurant.example.repository.EmployeeRepository;
import ir.restaurant.basic.basicrestaurant.example.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository personnelRepo;
    private AccountBankRepository accountRepo;
    private IEmployeeMapper personnelMapper;
    private IAccountBankMapper accountMapper;

    /**
     * author : mehdi_hosseini
     * write for date : 2022/09/05
     * description :       اضافه کردن یک پرسنل جدید با این شرط که
     * پرسنل جدید بالا سری نداشته باشد یا اگر داشته باشد موجودیت بالایی اون را دریافت کرده و در این کاربر اضافه میکنیم
     */
    @Override
    public EmployeeModel save(EmployeeModel employeeModel) {
        EmployeeEntity employeeEntity = personnelMapper.convertToEntity(employeeModel);
        // throw exception
        if (employeeModel.getPersonnel() != null) {
            EmployeeEntity personnelParent =
                    personnelRepo.findById(employeeModel.getPersonnel()).get();
            employeeEntity.setPersonnel(personnelParent);
            EmployeeEntity personnel = personnelRepo.save(employeeEntity);
            if (personnel.getID() != null) {
                return personnelMapper.convertToModel(personnel);
            }
        } else {
            EmployeeEntity personnel = personnelRepo.save(employeeEntity);
            if (personnel.getID() != null) {
                return personnelMapper.convertToModel(personnel);
            }
        }
        return null;// throw exception business Exception
    }

    /**
     * author : mehdi_hosseini
     * write for date : 2022/09/05
     * description :  دریافت یک نمونه از کارمند بر اساس شماره ملی کارمند
     **/
    @Override
    public EmployeeModel findByCode(String code) {
        EmployeeEntity employeeEntity = personnelRepo.findByNationalCode(code);
        if (employeeEntity.getID() != null) {
            return personnelMapper.convertToModel(employeeEntity);
        }
        return null;//throw exception
    }

    /**
     * author : mehdi_hosseini
     * write for date : 2022/09/05
     * description : وجود کارمند در یک مکان بر اساس شماره ملی
     **/
    @Override
    public boolean existByCode(String code) {
        return personnelRepo.existsByNationalCode(code);
    }

    /**
     * author : mehdi_hosseini
     * write for date : 2022/09/05
     * description : غیر فعال کردن حساب کارمند بر اساس شماره ملی
     * -> + در این حالت باید حساب بانکی فرد هم غیر فعال شود و یا پاک شود
     **/
    @Override
    public boolean deleteByCode(String code) {
        if (existByCode(code)) {
            EmployeeEntity employeeEntity = personnelRepo.findByNationalCode(code);
            employeeEntity.setDeleted(true);
            EmployeeEntity entity = personnelRepo.save(employeeEntity);
            if (entity.getID() != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * author : mehdi_hosseini
     * write for date : 2022/09/05
     * description : دریافت تمام کارمندان بدون ( * هیچ فیلتر * : "چه کارمندان فعال و چه غیر فعال ")
     **/
    @Override
    public List<EmployeeModel> findAll() {
        List<EmployeeEntity> personnelEntities = (List<EmployeeEntity>) personnelRepo.findAll();
        if (!personnelEntities.isEmpty()) {
            return personnelMapper.convertToModel(personnelEntities);
        }
        return null;//throw null pointer exception
    }

    /**
     * author : mehdi_hosseini
     * write for date : 2022/09/05
     * description : اضافه کردن حساب بانکی برای کامند و دریافت آن کارمند بر اساس شماره ملی اون
     **/
    @Override
    public EmployeeModel addAccountBankForPersonnel(String nationalCode, AccountBankModel accountBankModel) {
        EmployeeEntity employeeEntity = personnelRepo.findByNationalCode(nationalCode);
        AccountBankEntity accountBankEntity = accountRepo.save(accountMapper.convertToEntity(accountBankModel));
        if (employeeEntity.getID() != null && accountBankEntity.getID() != null) {
            employeeEntity.setAccountBank(accountBankEntity);
            EmployeeEntity personnel = personnelRepo.save(employeeEntity);
            if (personnel.getID() != null) {
                return personnelMapper.convertToModel(personnel);
            }
        }
        return null; // throw exception
    }

    /**
    * author : mehdi_hosseini
    * write for date : 2022/09/05
    * description :
    **/



    /**
     * author : mehdi_hosseini
     * write for date : 2022/09/05
     * description :
     **/


}
