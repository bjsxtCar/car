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
@MappedJdbcTypes(JdbcType.VARCHAR)
public class StringToBooleanTypeHandler extends BaseTypeHandler<Boolean>
{
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException
    {
        String result = "0";
        if (parameter)
        {
            result = "1";
        }
        ps.setString(i,result);
    }

    @Override
    public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException
    {
        if ("0".equals(rs.getString(columnName)))
        {
            return Boolean.FALSE;
        }
        else
        {
            return Boolean.TRUE;
        }
    }

    @Override
    public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException
    {
        if ("0".equals(rs.getString(columnIndex)))
        {
            return Boolean.FALSE;
        }
        else
        {
            return Boolean.TRUE;
        }
    }

    @Override
    public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException
    {
        if ("0".equals(cs.getString(columnIndex)))
        {
            return Boolean.FALSE;
        }
        else
        {
            return Boolean.TRUE;
        }
    }
}
