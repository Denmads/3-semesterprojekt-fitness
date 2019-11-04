/*
 * This file is generated by jOOQ.
 */
package persistence.database.generated.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import persistence.database.generated.tables.SchemeTrainingProgram;


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
public class SchemeTrainingProgramRecord extends UpdatableRecordImpl<SchemeTrainingProgramRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 626222550;

    /**
     * Setter for <code>public.scheme_training_program.training_programid</code>.
     */
    public void setTrainingProgramid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.scheme_training_program.training_programid</code>.
     */
    public Integer getTrainingProgramid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.scheme_training_program.scheduleid</code>.
     */
    public void setScheduleid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.scheme_training_program.scheduleid</code>.
     */
    public Integer getScheduleid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.scheme_training_program.day</code>.
     */
    public void setDay(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.scheme_training_program.day</code>.
     */
    public String getDay() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return SchemeTrainingProgram.SCHEME_TRAINING_PROGRAM.TRAINING_PROGRAMID;
    }

    @Override
    public Field<Integer> field2() {
        return SchemeTrainingProgram.SCHEME_TRAINING_PROGRAM.SCHEDULEID;
    }

    @Override
    public Field<String> field3() {
        return SchemeTrainingProgram.SCHEME_TRAINING_PROGRAM.DAY;
    }

    @Override
    public Integer component1() {
        return getTrainingProgramid();
    }

    @Override
    public Integer component2() {
        return getScheduleid();
    }

    @Override
    public String component3() {
        return getDay();
    }

    @Override
    public Integer value1() {
        return getTrainingProgramid();
    }

    @Override
    public Integer value2() {
        return getScheduleid();
    }

    @Override
    public String value3() {
        return getDay();
    }

    @Override
    public SchemeTrainingProgramRecord value1(Integer value) {
        setTrainingProgramid(value);
        return this;
    }

    @Override
    public SchemeTrainingProgramRecord value2(Integer value) {
        setScheduleid(value);
        return this;
    }

    @Override
    public SchemeTrainingProgramRecord value3(String value) {
        setDay(value);
        return this;
    }

    @Override
    public SchemeTrainingProgramRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemeTrainingProgramRecord
     */
    public SchemeTrainingProgramRecord() {
        super(SchemeTrainingProgram.SCHEME_TRAINING_PROGRAM);
    }

    /**
     * Create a detached, initialised SchemeTrainingProgramRecord
     */
    public SchemeTrainingProgramRecord(Integer trainingProgramid, Integer scheduleid, String day) {
        super(SchemeTrainingProgram.SCHEME_TRAINING_PROGRAM);

        set(0, trainingProgramid);
        set(1, scheduleid);
        set(2, day);
    }
}
