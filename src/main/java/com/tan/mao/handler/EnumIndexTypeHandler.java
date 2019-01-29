package com.tan.mao.handler;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedJdbcTypes(JdbcType.TINYINT)
public class EnumIndexTypeHandler<E extends Enum<E>> extends BaseTypeHandler<E> {
    private static Logger logger = LoggerFactory.getLogger(EnumIndexTypeHandler.class);

    private Class<E> type;

    public EnumIndexTypeHandler() {}

    public EnumIndexTypeHandler(Class<E> type) {
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.toString());
    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return get(rs.getString(columnName));
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return get(rs.getString(columnIndex));
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return get(cs.getString(columnIndex));
    }

    private <E extends Enum<E>> E get(String v) {
        if (v == null) {
            return null;
        }
        if (StringUtils.isNumeric(v)) {
            return (E) get(type, Integer.parseInt(v));
        }
        return null;
    }

    private <E extends Enum<E>> E get(Class<E> type, Integer v) {
        Method method = null;
        E result = null;
        try {
            method = type.getMethod("get", Integer.class);
            result = (E)method.invoke(type, v);
        } catch (NoSuchMethodException e) {
            result = Enum.valueOf(type, String.valueOf(v));
            logger.error(e.getMessage(), e);
        } catch (IllegalAccessException e) {
            logger.error(e.getMessage(), e);
        } catch (InvocationTargetException e) {
            logger.error(e.getMessage(), e);
        }
        return result;
    }
}

