package helper

import groovy.sql.Sql
import model.Contact

class DBUtils {

    private static def sql

    static synchronized void setupDB(ConfigObject configObject){
        if(sql == null){
            sql = new Sql(createDataSource(configObject))
        }
    }

//    private static OracleDataSource createDataSource(ConfigObject configObject){
//        OracleDataSource ds = new OracleDataSource()
//        Properties prop = new Properties()
//        prop.setProperty("MinLimit", "1")
//        prop.setProperty("MaxLimit", "1")
//        ds.setURL(configObject.db.url)
//        ds.setUser(configObject.db.username)
//        ds.setPassword(configObject.db.password)
//        ds.steConnectionCachingEnabled(true)
//        ds.steConnectionCacheProperties(prop)
//        OracleDataSource ods = ds
//        ods
//    }

/*
    static void getCessionBank(Contact c) {
        def row = sql.firstRow("""
        SELECT id, name from ( SELECT contact.id, contact.name FROM CN_CONTACT contact
                join CN_CONTACT_ROLE role on contact.id = role.CONTACT_ID
                where role.ROLE_ID = 24 and contact.name LIKE 'Bzwbk %'
                order by dbms_random.value ) where rownum <= 1
            """
        )
        c.id = row.get("id")
        c.companyName = row.get("name")
    }

 */
}
