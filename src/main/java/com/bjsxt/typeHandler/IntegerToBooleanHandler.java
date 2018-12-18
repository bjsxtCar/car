package com.bjsxt.typeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(Boolean.class)
@MappedJdbcTypes(JdbcType.INTEGER)
public class IntegerToBooleanHandler extends BaseTypeHandler<Boolean>
{
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException
    {
        int result = 0;
        if (parameter)
        {
            result = 1;
        }
        ps.setInt(i,result);
    }

    @Override
    public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException
    {
        int num = rs.getInt(columnName);
        if (num <= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException
    {
        int num = rs.getInt(columnIndex);
        if (num <= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException
    {
        int num = cs.getInt(columnIndex);
        if (num <= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
