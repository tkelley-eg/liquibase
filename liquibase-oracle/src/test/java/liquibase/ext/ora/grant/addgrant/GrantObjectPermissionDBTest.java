package liquibase.ext.ora.grant.addgrant;

import liquibase.ext.ora.testing.BaseTestCase;
import org.junit.Before;
import org.junit.Test;

public class GrantObjectPermissionDBTest extends BaseTestCase {

    @Test
    public void placeholder() {

    }

//    private IDataSet loadedDataSet;
//
//    @Before
//    public void setUp() throws Exception {
//        changeLogFile = "liquibase/ext/ora/grant/addgrant/changelog.test.xml";
//        connectToDB();
//        cleanDB();
//    }
//
//    protected IDatabaseConnection getConnection() throws Exception {
//        return new DatabaseConnection(connection);
//    }
//
//    protected IDataSet getDataSet() throws Exception {
//        loadedDataSet = new FlatXmlDataSet(this.getClass().getClassLoader().getResourceAsStream(
//                "liquibase/ext/ora/grant/addgrant/input.xml"));
//
//        return loadedDataSet;
//    }
//
//    @Test
//    public void testCompare() throws Exception {
//        if (connection == null) {
//            return;
//        }
//
//        QueryDataSet actualDataSet = new QueryDataSet(getConnection());
//
//        liquiBase.update((String) null);
//        actualDataSet.addTable("USER_TAB_PRIVS_MADE", "select PRIVILEGE from USER_TAB_PRIVS_MADE WHERE TABLE_NAME = 'ADDGRANT' ORDER BY 1");
//        loadedDataSet = getDataSet();
//
//        Assertion.assertEquals(loadedDataSet, actualDataSet);
//    }

}