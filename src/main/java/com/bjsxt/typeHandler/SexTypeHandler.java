package com.bjsxt.typeHandler;

import com.bjsxt.exception.SexNotFoundException;
import com.bjsxt.pojo.enums.Sex;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(Sex.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class SexTypeHandler implements TypeHandler<Sex>
{
    @Override
    public void setParameter(PreparedStatement ps, int i, Sex parameter, JdbcType jdbcType) throws SQLException
    {
        ps.setString(i,parameter.toString());
    }

    @Override
    public Sex getResult(ResultSet rs, String columnName) throws SQLException
    {
        Sex result = null;
        try
        {
            result = Sex.getSexByText(rs.getString(columnName));
        }
        catch (SexNotFoundException e)
        {
            //TODO 改为记录日志
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Sex getResult(ResultSet rs, int columnIndex) throws SQLException
    {
        Sex result = null;
        try
        {
            result = Sex.getSexByText(rs.getString(columnIndex));
        }
        catch (SexNotFoundException e)
        {
            //TODO
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Sex getResult(CallableStatement cs, int columnIndex) throws SQLException
    {
        Sex result = null;
        try
        {
            result = Sex.getSexByText(cs.getString(columnIndex));
        }
        catch (SexNotFoundException e)
        {
            //TODO
            e.printStackTrace();
        }
        return result;
    }
}
