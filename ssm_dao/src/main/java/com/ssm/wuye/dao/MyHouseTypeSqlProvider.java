package com.ssm.wuye.dao;

import com.ssm.wuye.domain.MyHouseType;
import com.ssm.wuye.domain.MyHouseTypeExample.Criteria;
import com.ssm.wuye.domain.MyHouseTypeExample.Criterion;
import com.ssm.wuye.domain.MyHouseTypeExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MyHouseTypeSqlProvider {

    public String countByExample(MyHouseTypeExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("wy_house_type");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MyHouseTypeExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("wy_house_type");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MyHouseType record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("wy_house_type");
        
        if (record.getHtypeid() != null) {
            sql.VALUES("hTypeId", "#{htypeid,jdbcType=INTEGER}");
        }
        
        if (record.getHtypename() != null) {
            sql.VALUES("hTypeName", "#{htypename,jdbcType=VARCHAR}");
        }
        
        if (record.getHtpropertyright() != null) {
            sql.VALUES("htPropertyRight", "#{htpropertyright,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MyHouseTypeExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("hTypeId");
        } else {
            sql.SELECT("hTypeId");
        }
        sql.SELECT("hTypeName");
        sql.SELECT("htPropertyRight");
        sql.FROM("wy_house_type");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MyHouseType record = (MyHouseType) parameter.get("record");
        MyHouseTypeExample example = (MyHouseTypeExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("wy_house_type");
        
        if (record.getHtypeid() != null) {
            sql.SET("hTypeId = #{record.htypeid,jdbcType=INTEGER}");
        }
        
        if (record.getHtypename() != null) {
            sql.SET("hTypeName = #{record.htypename,jdbcType=VARCHAR}");
        }
        
        if (record.getHtpropertyright() != null) {
            sql.SET("htPropertyRight = #{record.htpropertyright,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("wy_house_type");
        
        sql.SET("hTypeId = #{record.htypeid,jdbcType=INTEGER}");
        sql.SET("hTypeName = #{record.htypename,jdbcType=VARCHAR}");
        sql.SET("htPropertyRight = #{record.htpropertyright,jdbcType=VARCHAR}");
        
        MyHouseTypeExample example = (MyHouseTypeExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MyHouseType record) {
        SQL sql = new SQL();
        sql.UPDATE("wy_house_type");
        
        if (record.getHtypename() != null) {
            sql.SET("hTypeName = #{htypename,jdbcType=VARCHAR}");
        }
        
        if (record.getHtpropertyright() != null) {
            sql.SET("htPropertyRight = #{htpropertyright,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("hTypeId = #{htypeid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MyHouseTypeExample example, boolean includeExamplePhrase) {
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