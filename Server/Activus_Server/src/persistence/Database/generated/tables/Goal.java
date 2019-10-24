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
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import persistence.database.generated.Indexes;
import persistence.database.generated.Keys;
import persistence.database.generated.Public;
import persistence.database.generated.tables.records.GoalRecord;


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
public class Goal extends TableImpl<GoalRecord> {

    private static final long serialVersionUID = -1105968222;

    /**
     * The reference instance of <code>public.goal</code>
     */
    public static final Goal GOAL = new Goal();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GoalRecord> getRecordType() {
        return GoalRecord.class;
    }

    /**
     * The column <code>public.goal.id</code>.
     */
    public final TableField<GoalRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('goal_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.goal.profileid</code>.
     */
    public final TableField<GoalRecord, Integer> PROFILEID = createField(DSL.name("profileid"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.goal.weight</code>.
     */
    public final TableField<GoalRecord, Integer> WEIGHT = createField(DSL.name("weight"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("(-1)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.goal.goal_text</code>.
     */
    public final TableField<GoalRecord, String> GOAL_TEXT = createField(DSL.name("goal_text"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("'Why do I need a goal? I am to good to set a goal.'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.goal</code> table reference
     */
    public Goal() {
        this(DSL.name("goal"), null);
    }

    /**
     * Create an aliased <code>public.goal</code> table reference
     */
    public Goal(String alias) {
        this(DSL.name(alias), GOAL);
    }

    /**
     * Create an aliased <code>public.goal</code> table reference
     */
    public Goal(Name alias) {
        this(alias, GOAL);
    }

    private Goal(Name alias, Table<GoalRecord> aliased) {
        this(alias, aliased, null);
    }

    private Goal(Name alias, Table<GoalRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Goal(Table<O> child, ForeignKey<O, GoalRecord> key) {
        super(child, key, GOAL);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GOAL_PKEY);
    }

    @Override
    public Identity<GoalRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GOAL;
    }

    @Override
    public UniqueKey<GoalRecord> getPrimaryKey() {
        return Keys.GOAL_PKEY;
    }

    @Override
    public List<UniqueKey<GoalRecord>> getKeys() {
        return Arrays.<UniqueKey<GoalRecord>>asList(Keys.GOAL_PKEY);
    }

    @Override
    public List<ForeignKey<GoalRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GoalRecord, ?>>asList(Keys.GOAL__FKGOAL645380);
    }

    public Profile profile() {
        return new Profile(this, Keys.GOAL__FKGOAL645380);
    }

    @Override
    public Goal as(String alias) {
        return new Goal(DSL.name(alias), this);
    }

    @Override
    public Goal as(Name alias) {
        return new Goal(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Goal rename(String name) {
        return new Goal(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Goal rename(Name name) {
        return new Goal(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}