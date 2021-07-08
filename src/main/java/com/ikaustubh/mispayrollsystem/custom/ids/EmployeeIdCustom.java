package com.ikaustubh.mispayrollsystem.custom.ids;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ikaustubh.mispayrollsystem.comman.Constants;
import com.ikaustubh.mispayrollsystem.controller.EmployeeController;

/**
 * 
 * This Class is create a custom employee id. <BR>
 * e.g. DMIS1, DMIS2, DMIS3.....
 * 
 * @author Dnyaneshwar Chavan
 * @since 01-July-2021
 *
 */
public class EmployeeIdCustom extends SequenceStyleGenerator {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	public EmployeeIdCustom() {
	}

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String methodName = "generate |";
		logger.info(methodName + Constants.START);
		String nextEmpID = Constants.EMP_ID_PREFIX +"1";
		try {
			Connection connection = session.connection();
			PreparedStatement pst = connection
					.prepareStatement("SELECT COUNT(EMP_TBL_RID) as COUNT  FROM EMP_TBL");
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				long empTblRID = rs.getLong("COUNT");
				logger.info(methodName + " last empId[" + empTblRID + "]");
				nextEmpID = Constants.EMP_ID_PREFIX	+ (empTblRID +1);
				logger.info(methodName + " nextEmpID [" + nextEmpID + "]");
			}
		} catch (SQLException e) {
			logger.error(methodName + "Exception while creating the custom employee id", e);
		}
		logger.info(methodName + Constants.END);
		return nextEmpID;
	}

}
