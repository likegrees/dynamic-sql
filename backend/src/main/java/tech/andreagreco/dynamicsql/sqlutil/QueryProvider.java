package tech.andreagreco.dynamicsql.sqlutil;

import org.apache.ibatis.jdbc.SQL;

/**
 * @author LikeGrees
 */
public class QueryProvider {
    public String getSelect(SQL query){
        return query.toString();
    }
}
