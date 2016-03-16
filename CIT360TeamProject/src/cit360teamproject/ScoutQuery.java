/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360teamproject;

import org.hibernate.Session;

/**
 *
 * @author hiattech
 */
public class ScoutQuery {
    
    Session session = null;
    
    public ScoutQuery() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    
}
}
