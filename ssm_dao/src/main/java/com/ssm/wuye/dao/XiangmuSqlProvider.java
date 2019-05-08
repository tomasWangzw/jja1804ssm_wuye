package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Xiangmu;
import com.ssm.wuye.domain.XiangmuExample.Criteria;
import com.ssm.wuye.domain.XiangmuExample.Criterion;
import com.ssm.wuye.domain.XiangmuExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class XiangmuSqlProvider {

    public String countByExample(XiangmuExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("xiangmu");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(XiangmuExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("xiangmu");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Xiangmu record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("xiangmu");
        
        if (record.getPid() != null) {
            sql.VALUES("pid", "#{pid,jdbcType=INTEGER}");
        }
        
        if (record.getPname() != null) {
            sql.VALUES("pname", "#{pname,jdbcType=VARCHAR}");
        }
        
        if (record.getPpicture() != null) {
            sql.VALUES("ppicture", "#{ppicture,jdbcType=VARCHAR}");
        }
        
        if (record.getPintroduce() != null) {
            sql.VALUES("pintroduce", "#{pintroduce,jdbcType=VARCHAR}");
        }
        
        if (record.getPadress() != null) {
            sql.VALUES("padress", "#{padress,jdbcType=VARCHAR}");
        }
        
        if (record.getPtid() != null) {
            sql.VALUES("ptid", "#{ptid,jdbcType=INTEGER}");
        }
        
        if (record.getPtypename() != null) {
            sql.VALUES("ptypename", "#{ptypename,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(XiangmuExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("pid");
        } else {
            sql.SELECT("pid");
        }
        sql.SELECT("pname");
        sql.SELECT("ppicture");
        sql.SELECT("pintroduce");
        sql.SELECT("padress");
        sql.SELECT("ptid");
        sql.SELECT("ptypename");
        sql.FROM("xiangmu");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Xiangmu record = (Xiangmu) parameter.get("record");
        XiangmuExample example = (XiangmuExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("xiangmu");
        
        if (record.getPid() != null) {
            sql.SET("pid = #{record.pid,jdbcType=INTEGER}");
        }
        
        if (record.getPname() != null) {
            sql.SET("pname = #{record.pname,jdbcType=VARCHAR}");
        }
        
        if (record.getPpicture() != null) {
            sql.SET("ppicture = #{record.ppicture,jdbcType=VARCHAR}");
        }
        
        if (record.getPintroduce() != null) {
            sql.SET("pintroduce = #{record.pintroduce,jdbcType=VARCHAR}");
        }
        
        if (record.getPadress() != null) {
            sql.SET("padress = #{record.padress,jdbcType=VARCHAR}");
        }
        
        if (record.getPtid() != null) {
            sql.SET("ptid = #{record.ptid,jdbcType=INTEGER}");
        }
        
        if (record.getPtypename() != null) {
            sql.SET("ptypename = #{record.ptypename,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("xiangmu");
        
        sql.SET("pid = #{record.pid,jdbcType=INTEGER}");
        sql.SET("pname = #{record.pname,jdbcType=VARCHAR}");
        sql.SET("ppicture = #{record.ppicture,jdbcType=VARCHAR}");
        sql.SET("pintroduce = #{record.pintroduce,jdbcType=VARCHAR}");
        sql.SET("padress = #{record.padress,jdbcType=VARCHAR}");
        sql.SET("ptid = #{record.ptid,jdbcType=INTEGER}");
        sql.SET("ptypename = #{record.ptypename,jdbcType=VARCHAR}");
        
        XiangmuExample example = (XiangmuExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, XiangmuExample example, boolean includeExamplePhrase) {
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