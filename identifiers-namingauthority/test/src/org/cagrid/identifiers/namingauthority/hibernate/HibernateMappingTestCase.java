package org.cagrid.identifiers.namingauthority.hibernate;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.cagrid.identifiers.namingauthority.test.NamingAuthorityIntegrationTestCaseBase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.persister.entity.EntityPersister;


public class HibernateMappingTestCase extends NamingAuthorityIntegrationTestCaseBase {

    protected SessionFactory sessionFactory;


    public void testEverything() throws Exception {
        Map metadata = sessionFactory.getAllClassMetadata();
        String className = "";
        for (Iterator i = metadata.values().iterator(); i.hasNext();) {
            Session session = sessionFactory.openSession();
            try {
                EntityPersister persister = (EntityPersister) i.next();
                className = persister.getEntityName();
                System.out.println("select: " + className);
                List result = session.createQuery("from " + className + " c").list();
                System.out.println("returned " + result.size() + " records for " +
                 className);

                assertTrue(true);

            } catch (Exception ex) {
                fail("Hibernate mapping error. Following class has incorrect mapping: " + className);
            } finally {
                session.close();
            }
        }
    }


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
