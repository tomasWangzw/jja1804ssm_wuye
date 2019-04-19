package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Tbmatter_sort;
import com.ssm.wuye.domain.Tbmatter_sortExample.Criteria;
import com.ssm.wuye.domain.Tbmatter_sortExample.Criterion;
import com.ssm.wuye.domain.Tbmatter_sortExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class Tbmatter_sortSqlProvider {

    public String countByExample(Tbmatter_sortExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_matter_sort");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(Tbmatter_sortExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_matter_sort");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Tbmatter_sort record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_matter_sort");
        
        if (record.getMattersortid() != null) {
            sql.VALUES("matterSortId", "#{mattersortid,jdbcType=INTEGER}");
        }
        
        if (record.getMattersort() != null) {
            sql.VALUES("matterSort", "#{mattersort,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(Tbmatter_sortExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("matterSortId");
        } else {
            sql.SELECT("matterSortId");
        }
        sql.SELECT("matterSort");
        sql.FROM("tb_matter_sort");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Tbmatter_sort record = (Tbmatter_sort) parameter.get("record");
        Tbmatter_sortExample example = (Tbmatter_sortExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_matter_sort");
        
        if (record.getMattersortid() != null) {
            sql.SET("matterSortId = #{record.mattersortid,jdbcType=INTEGER}");
        }
        
        if (record.getMattersort() != null) {
            sql.SET("matterSort = #{record.mattersort,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_matter_sort");
        
        sql.SET("matterSortId = #{record.mattersortid,jdbcType=INTEGER}");
        sql.SET("matterSort = #{record.mattersort,jdbcType=VARCHAR}");
        
        Tbmatter_sortExample example = (Tbmatter_sortExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Tbmatter_sort record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_matter_sort");
        
        if (record.getMattersort() != null) {
            sql.SET("matterSort = #{mattersort,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("matterSortId = #{mattersortid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, Tbmatter_sortExample example, boolean includeExamplePhrase) {
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