/*
 * This file is generated by jOOQ.
 */
package persistence.database.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
import persistence.database.generated.tables.records.ScheduleTrainingProgramRecord;


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
public class ScheduleTrainingProgram extends TableImpl<ScheduleTrainingProgramRecord> {

    private static final long serialVersionUID = -754679724;

    /**
     * The reference instance of <code>public.schedule_training_program</code>
     */
    public static final ScheduleTrainingProgram SCHEDULE_TRAINING_PROGRAM = new ScheduleTrainingProgram();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScheduleTrainingProgramRecord> getRecordType() {
        return ScheduleTrainingProgramRecord.class;
    }

    /**
     * The column <code>public.schedule_training_program.training_programid</code>.
     */
    public final TableField<ScheduleTrainingProgramRecord, Integer> TRAINING_PROGRAMID = createField(DSL.name("training_programid"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.schedule_training_program.scheduleid</code>.
     */
    public final TableField<ScheduleTrainingProgramRecord, Integer> SCHEDULEID = createField(DSL.name("scheduleid"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.schedule_training_program.day</code>.
     */
    public final TableField<ScheduleTrainingProgramRecord, String> DAY = createField(DSL.name("day"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("'No day'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.schedule_training_program</code> table reference
     */
    public ScheduleTrainingProgram() {
        this(DSL.name("schedule_training_program"), null);
    }

    /**
     * Create an aliased <code>public.schedule_training_program</code> table reference
     */
    public ScheduleTrainingProgram(String alias) {
        this(DSL.name(alias), SCHEDULE_TRAINING_PROGRAM);
    }

    /**
     * Create an aliased <code>public.schedule_training_program</code> table reference
     */
    public ScheduleTrainingProgram(Name alias) {
        this(alias, SCHEDULE_TRAINING_PROGRAM);
    }

    private ScheduleTrainingProgram(Name alias, Table<ScheduleTrainingProgramRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScheduleTrainingProgram(Name alias, Table<ScheduleTrainingProgramRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ScheduleTrainingProgram(Table<O> child, ForeignKey<O, ScheduleTrainingProgramRecord> key) {
        super(child, key, SCHEDULE_TRAINING_PROGRAM);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SCHEDULE_TRAINING_PROGRAM_DAY, Indexes.SCHEDULE_TRAINING_PROGRAM_PKEY);
    }

    @Override
    public UniqueKey<ScheduleTrainingProgramRecord> getPrimaryKey() {
        return Keys.SCHEDULE_TRAINING_PROGRAM_PKEY;
    }

    @Override
    public List<UniqueKey<ScheduleTrainingProgramRecord>> getKeys() {
        return Arrays.<UniqueKey<ScheduleTrainingProgramRecord>>asList(Keys.SCHEDULE_TRAINING_PROGRAM_PKEY);
    }

    @Override
    public List<ForeignKey<ScheduleTrainingProgramRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ScheduleTrainingProgramRecord, ?>>asList(Keys.SCHEDULE_TRAINING_PROGRAM__FKSCHEDULE_T666201, Keys.SCHEDULE_TRAINING_PROGRAM__FKSCHEDULE_T690353);
    }

    public TrainingProgram trainingProgram() {
        return new TrainingProgram(this, Keys.SCHEDULE_TRAINING_PROGRAM__FKSCHEDULE_T666201);
    }

    public Schedule schedule() {
        return new Schedule(this, Keys.SCHEDULE_TRAINING_PROGRAM__FKSCHEDULE_T690353);
    }

    @Override
    public ScheduleTrainingProgram as(String alias) {
        return new ScheduleTrainingProgram(DSL.name(alias), this);
    }

    @Override
    public ScheduleTrainingProgram as(Name alias) {
        return new ScheduleTrainingProgram(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScheduleTrainingProgram rename(String name) {
        return new ScheduleTrainingProgram(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ScheduleTrainingProgram rename(Name name) {
        return new ScheduleTrainingProgram(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}