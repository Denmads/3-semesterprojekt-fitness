/*
 * This file is generated by jOOQ.
 */
package Persistence.Database.generated.tables;


import Persistence.Database.generated.Indexes;
import Persistence.Database.generated.Keys;
import Persistence.Database.generated.Public;
import Persistence.Database.generated.tables.records.SchemeProfileRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchemeProfile extends TableImpl<SchemeProfileRecord> {

    private static final long serialVersionUID = -880911099;

    /**
     * The reference instance of <code>public.scheme_profile</code>
     */
    public static final SchemeProfile SCHEME_PROFILE = new SchemeProfile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemeProfileRecord> getRecordType() {
        return SchemeProfileRecord.class;
    }

    /**
     * The column <code>public.scheme_profile.scheduleid</code>.
     */
    public final TableField<SchemeProfileRecord, Integer> SCHEDULEID = createField(DSL.name("scheduleid"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.scheme_profile.profileid</code>.
     */
    public final TableField<SchemeProfileRecord, Integer> PROFILEID = createField(DSL.name("profileid"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.scheme_profile</code> table reference
     */
    public SchemeProfile() {
        this(DSL.name("scheme_profile"), null);
    }

    /**
     * Create an aliased <code>public.scheme_profile</code> table reference
     */
    public SchemeProfile(String alias) {
        this(DSL.name(alias), SCHEME_PROFILE);
    }

    /**
     * Create an aliased <code>public.scheme_profile</code> table reference
     */
    public SchemeProfile(Name alias) {
        this(alias, SCHEME_PROFILE);
    }

    private SchemeProfile(Name alias, Table<SchemeProfileRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchemeProfile(Name alias, Table<SchemeProfileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SchemeProfile(Table<O> child, ForeignKey<O, SchemeProfileRecord> key) {
        super(child, key, SCHEME_PROFILE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SCHEME_PROFILE_PKEY);
    }

    @Override
    public UniqueKey<SchemeProfileRecord> getPrimaryKey() {
        return Keys.SCHEME_PROFILE_PKEY;
    }

    @Override
    public List<UniqueKey<SchemeProfileRecord>> getKeys() {
        return Arrays.<UniqueKey<SchemeProfileRecord>>asList(Keys.SCHEME_PROFILE_PKEY);
    }

    @Override
    public List<ForeignKey<SchemeProfileRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SchemeProfileRecord, ?>>asList(Keys.SCHEME_PROFILE__FKSCHEME_PRO761813, Keys.SCHEME_PROFILE__FKSCHEME_PRO981379);
    }

    public Scheme scheme() {
        return new Scheme(this, Keys.SCHEME_PROFILE__FKSCHEME_PRO761813);
    }

    public Profile profile() {
        return new Profile(this, Keys.SCHEME_PROFILE__FKSCHEME_PRO981379);
    }

    @Override
    public SchemeProfile as(String alias) {
        return new SchemeProfile(DSL.name(alias), this);
    }

    @Override
    public SchemeProfile as(Name alias) {
        return new SchemeProfile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemeProfile rename(String name) {
        return new SchemeProfile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemeProfile rename(Name name) {
        return new SchemeProfile(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
