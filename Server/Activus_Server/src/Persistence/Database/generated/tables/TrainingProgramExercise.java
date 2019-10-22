/*
 * This file is generated by jOOQ.
 */
package Persistence.Database.generated.tables;


import Persistence.Database.generated.Indexes;
import Persistence.Database.generated.Keys;
import Persistence.Database.generated.Public;
import Persistence.Database.generated.tables.records.TrainingProgramExerciseRecord;

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
public class TrainingProgramExercise extends TableImpl<TrainingProgramExerciseRecord> {

    private static final long serialVersionUID = -1787447652;

    /**
     * The reference instance of <code>public.training_program_exercise</code>
     */
    public static final TrainingProgramExercise TRAINING_PROGRAM_EXERCISE = new TrainingProgramExercise();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrainingProgramExerciseRecord> getRecordType() {
        return TrainingProgramExerciseRecord.class;
    }

    /**
     * The column <code>public.training_program_exercise.exerciseid</code>.
     */
    public final TableField<TrainingProgramExerciseRecord, Integer> EXERCISEID = createField(DSL.name("exerciseid"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.training_program_exercise.training_programid</code>.
     */
    public final TableField<TrainingProgramExerciseRecord, Integer> TRAINING_PROGRAMID = createField(DSL.name("training_programid"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.training_program_exercise</code> table reference
     */
    public TrainingProgramExercise() {
        this(DSL.name("training_program_exercise"), null);
    }

    /**
     * Create an aliased <code>public.training_program_exercise</code> table reference
     */
    public TrainingProgramExercise(String alias) {
        this(DSL.name(alias), TRAINING_PROGRAM_EXERCISE);
    }

    /**
     * Create an aliased <code>public.training_program_exercise</code> table reference
     */
    public TrainingProgramExercise(Name alias) {
        this(alias, TRAINING_PROGRAM_EXERCISE);
    }

    private TrainingProgramExercise(Name alias, Table<TrainingProgramExerciseRecord> aliased) {
        this(alias, aliased, null);
    }

    private TrainingProgramExercise(Name alias, Table<TrainingProgramExerciseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TrainingProgramExercise(Table<O> child, ForeignKey<O, TrainingProgramExerciseRecord> key) {
        super(child, key, TRAINING_PROGRAM_EXERCISE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TRAINING_PROGRAM_EXERCISE_PKEY);
    }

    @Override
    public UniqueKey<TrainingProgramExerciseRecord> getPrimaryKey() {
        return Keys.TRAINING_PROGRAM_EXERCISE_PKEY;
    }

    @Override
    public List<UniqueKey<TrainingProgramExerciseRecord>> getKeys() {
        return Arrays.<UniqueKey<TrainingProgramExerciseRecord>>asList(Keys.TRAINING_PROGRAM_EXERCISE_PKEY);
    }

    @Override
    public List<ForeignKey<TrainingProgramExerciseRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TrainingProgramExerciseRecord, ?>>asList(Keys.TRAINING_PROGRAM_EXERCISE__FKTRAINING_P194169, Keys.TRAINING_PROGRAM_EXERCISE__FKTRAINING_P855275);
    }

    public Exercise exercise() {
        return new Exercise(this, Keys.TRAINING_PROGRAM_EXERCISE__FKTRAINING_P194169);
    }

    public TrainingProgram trainingProgram() {
        return new TrainingProgram(this, Keys.TRAINING_PROGRAM_EXERCISE__FKTRAINING_P855275);
    }

    @Override
    public TrainingProgramExercise as(String alias) {
        return new TrainingProgramExercise(DSL.name(alias), this);
    }

    @Override
    public TrainingProgramExercise as(Name alias) {
        return new TrainingProgramExercise(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TrainingProgramExercise rename(String name) {
        return new TrainingProgramExercise(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TrainingProgramExercise rename(Name name) {
        return new TrainingProgramExercise(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
