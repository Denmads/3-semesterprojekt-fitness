/*
 * This file is generated by jOOQ.
 */
package persistence.database.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import persistence.database.generated.Indexes;
import persistence.database.generated.Keys;
import persistence.database.generated.Public;
import persistence.database.generated.tables.records.SchemeRecord;


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
public class Scheme extends TableImpl<SchemeRecord> {

    private static final long serialVersionUID = -1428397509;

    /**
     * The reference instance of <code>public.scheme</code>
     */
    public static final Scheme SCHEME = new Scheme();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemeRecord> getRecordType() {
        return SchemeRecord.class;
    }

    /**
     * The column <code>public.scheme.id</code>.
     */
    public final TableField<SchemeRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('scheme_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.scheme.name</code>.
     */
    public final TableField<SchemeRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("'No name'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.scheme.description</code>.
     */
    public final TableField<SchemeRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("'No description'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.scheme</code> table reference
     */
    public Scheme() {
        this(DSL.name("scheme"), null);
    }

    /**
     * Create an aliased <code>public.scheme</code> table reference
     */
    public Scheme(String alias) {
        this(DSL.name(alias), SCHEME);
    }

    /**
     * Create an aliased <code>public.scheme</code> table reference
     */
    public Scheme(Name alias) {
        this(alias, SCHEME);
    }

    private Scheme(Name alias, Table<SchemeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Scheme(Name alias, Table<SchemeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Scheme(Table<O> child, ForeignKey<O, SchemeRecord> key) {
        super(child, key, SCHEME);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SCHEME_PKEY);
    }

    @Override
    public Identity<SchemeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SCHEME;
    }

    @Override
    public UniqueKey<SchemeRecord> getPrimaryKey() {
        return Keys.SCHEME_PKEY;
    }

    @Override
    public List<UniqueKey<SchemeRecord>> getKeys() {
        return Arrays.<UniqueKey<SchemeRecord>>asList(Keys.SCHEME_PKEY);
    }

    @Override
    public Scheme as(String alias) {
        return new Scheme(DSL.name(alias), this);
    }

    @Override
    public Scheme as(Name alias) {
        return new Scheme(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Scheme rename(String name) {
        return new Scheme(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Scheme rename(Name name) {
        return new Scheme(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
