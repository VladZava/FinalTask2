package edu.slovak;

import java.util.List;

public class CompanyImpl implements ICompany {
    @Override
    public Company getTopLevelParent(Company child) {
        return null;
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        return 0;
    }
}
