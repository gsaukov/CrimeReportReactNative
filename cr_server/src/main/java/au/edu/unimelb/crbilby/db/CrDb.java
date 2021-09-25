/*
 * This file is generated by jOOQ.
 */
package au.edu.unimelb.crbilby.db;


import au.edu.unimelb.crbilby.db.tables.Case;
import au.edu.unimelb.crbilby.db.tables.CaseAssign;
import au.edu.unimelb.crbilby.db.tables.CaseEvidence;
import au.edu.unimelb.crbilby.db.tables.CaseNotes;
import au.edu.unimelb.crbilby.db.tables.CaseOtherCrimes;
import au.edu.unimelb.crbilby.db.tables.CrimeType;
import au.edu.unimelb.crbilby.db.tables.EscalateLevel;
import au.edu.unimelb.crbilby.db.tables.LeaPost;
import au.edu.unimelb.crbilby.db.tables.Post;
import au.edu.unimelb.crbilby.db.tables.Profile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * The schema <code>cr_db</code>.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CrDb extends SchemaImpl {

    private static final long serialVersionUID = -355405730;

    /**
     * The reference instance of <code>cr_db</code>
     */
    public static final CrDb CR_DB = new CrDb();

    /**
     * The table <code>cr_db.Escalate_level</code>.
     */
    public final EscalateLevel ESCALATE_LEVEL = au.edu.unimelb.crbilby.db.tables.EscalateLevel.ESCALATE_LEVEL;

    /**
     * The table <code>cr_db.case</code>.
     */
    public final Case CASE = au.edu.unimelb.crbilby.db.tables.Case.CASE;

    /**
     * The table <code>cr_db.case_assign</code>.
     */
    public final CaseAssign CASE_ASSIGN = au.edu.unimelb.crbilby.db.tables.CaseAssign.CASE_ASSIGN;

    /**
     * The table <code>cr_db.case_evidence</code>.
     */
    public final CaseEvidence CASE_EVIDENCE = au.edu.unimelb.crbilby.db.tables.CaseEvidence.CASE_EVIDENCE;

    /**
     * The table <code>cr_db.case_notes</code>.
     */
    public final CaseNotes CASE_NOTES = au.edu.unimelb.crbilby.db.tables.CaseNotes.CASE_NOTES;

    /**
     * The table <code>cr_db.case_other_crimes</code>.
     */
    public final CaseOtherCrimes CASE_OTHER_CRIMES = au.edu.unimelb.crbilby.db.tables.CaseOtherCrimes.CASE_OTHER_CRIMES;

    /**
     * The table <code>cr_db.crime_type</code>.
     */
    public final CrimeType CRIME_TYPE = au.edu.unimelb.crbilby.db.tables.CrimeType.CRIME_TYPE;

    /**
     * The table <code>cr_db.lea_post</code>.
     */
    public final LeaPost LEA_POST = au.edu.unimelb.crbilby.db.tables.LeaPost.LEA_POST;

    /**
     * The table <code>cr_db.post</code>.
     */
    public final Post POST = au.edu.unimelb.crbilby.db.tables.Post.POST;

    /**
     * The table <code>cr_db.profile</code>.
     */
    public final Profile PROFILE = au.edu.unimelb.crbilby.db.tables.Profile.PROFILE;

    /**
     * No further instances allowed
     */
    private CrDb() {
        super("cr_db", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            EscalateLevel.ESCALATE_LEVEL,
            Case.CASE,
            CaseAssign.CASE_ASSIGN,
            CaseEvidence.CASE_EVIDENCE,
            CaseNotes.CASE_NOTES,
            CaseOtherCrimes.CASE_OTHER_CRIMES,
            CrimeType.CRIME_TYPE,
            LeaPost.LEA_POST,
            Post.POST,
            Profile.PROFILE);
    }
}
