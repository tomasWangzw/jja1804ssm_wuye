package com.ssm.wuye.dao;

import com.ssm.wuye.domain.ChGasMeter;
import com.ssm.wuye.domain.ChGasMeterExample.Criteria;
import com.ssm.wuye.domain.ChGasMeterExample.Criterion;
import com.ssm.wuye.domain.ChGasMeterExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ChGasMeterSqlProvider {

    public String countByExample(ChGasMeterExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("ch_gas_meter");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ChGasMeterExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("ch_gas_meter");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ChGasMeter record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ch_gas_meter");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGasnumber() != null) {
            sql.VALUES("gasNumber", "#{gasnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getHouseid() != null) {
            sql.VALUES("houseid", "#{houseid,jdbcType=INTEGER}");
        }
        
        if (record.getGas() != null) {
            sql.VALUES("gas", "#{gas,jdbcType=DOUBLE}");
        }
        
        if (record.getMonth() != null) {
            sql.VALUES("month", "#{month,jdbcType=DATE}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ChGasMeterExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("gasNumber");
        sql.SELECT("houseid");
        sql.SELECT("gas");
        sql.SELECT("month");
        sql.FROM("ch_gas_meter");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ChGasMeter record = (ChGasMeter) parameter.get("record");
        ChGasMeterExample example = (ChGasMeterExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("ch_gas_meter");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getGasnumber() != null) {
            sql.SET("gasNumber = #{record.gasnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getHouseid() != null) {
            sql.SET("houseid = #{record.houseid,jdbcType=INTEGER}");
        }
        
        if (record.getGas() != null) {
            sql.SET("gas = #{record.gas,jdbcType=DOUBLE}");
        }
        
        if (record.getMonth() != null) {
            sql.SET("month = #{record.month,jdbcType=DATE}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("ch_gas_meter");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("gasNumber = #{record.gasnumber,jdbcType=VARCHAR}");
        sql.SET("houseid = #{record.houseid,jdbcType=INTEGER}");
        sql.SET("gas = #{record.gas,jdbcType=DOUBLE}");
        sql.SET("month = #{record.month,jdbcType=DATE}");
        
        ChGasMeterExample example = (ChGasMeterExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ChGasMeter record) {
        SQL sql = new SQL();
        sql.UPDATE("ch_gas_meter");
        
        if (record.getGasnumber() != null) {
            sql.SET("gasNumber = #{gasnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getHouseid() != null) {
            sql.SET("houseid = #{houseid,jdbcType=INTEGER}");
        }
        
        if (record.getGas() != null) {
            sql.SET("gas = #{gas,jdbcType=DOUBLE}");
        }
        
        if (record.getMonth() != null) {
            sql.SET("month = #{month,jdbcType=DATE}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ChGasMeterExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}