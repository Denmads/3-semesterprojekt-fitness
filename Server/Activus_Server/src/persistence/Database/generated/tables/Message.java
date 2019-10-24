/*
 * This file is generated by jOOQ.
 */
package persistence.database.generated.tables;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import persistence.database.generated.Indexes;
import persistence.database.generated.Keys;
import persistence.database.generated.Public;
import persistence.database.generated.tables.records.MessageRecord;


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
public class Message extends TableImpl<MessageRecord> {

    private static final long serialVersionUID = 1533406356;

    /**
     * The reference instance of <code>public.message</code>
     */
    public static final Message MESSAGE = new Message();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MessageRecord> getRecordType() {
        return MessageRecord.class;
    }

    /**
     * The column <code>public.message.id</code>.
     */
    public final TableField<MessageRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('message_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.message.sender</code>.
     */
    public final TableField<MessageRecord, Integer> SENDER = createField(DSL.name("sender"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.message.receiver</code>.
     */
    public final TableField<MessageRecord, Integer> RECEIVER = createField(DSL.name("receiver"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.message.message</code>.
     */
    public final TableField<MessageRecord, String> MESSAGE_ = createField(DSL.name("message"), org.jooq.impl.SQLDataType.VARCHAR(1023).nullable(false), this, "");

    /**
     * The column <code>public.message.time</code>.
     */
    public final TableField<MessageRecord, Timestamp> TIME = createField(DSL.name("time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.message.date</code>.
     */
    public final TableField<MessageRecord, Date> DATE = createField(DSL.name("date"), org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * Create a <code>public.message</code> table reference
     */
    public Message() {
        this(DSL.name("message"), null);
    }

    /**
     * Create an aliased <code>public.message</code> table reference
     */
    public Message(String alias) {
        this(DSL.name(alias), MESSAGE);
    }

    /**
     * Create an aliased <code>public.message</code> table reference
     */
    public Message(Name alias) {
        this(alias, MESSAGE);
    }

    private Message(Name alias, Table<MessageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Message(Name alias, Table<MessageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Message(Table<O> child, ForeignKey<O, MessageRecord> key) {
        super(child, key, MESSAGE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MESSAGE_PKEY);
    }

    @Override
    public Identity<MessageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MESSAGE;
    }

    @Override
    public UniqueKey<MessageRecord> getPrimaryKey() {
        return Keys.MESSAGE_PKEY;
    }

    @Override
    public List<UniqueKey<MessageRecord>> getKeys() {
        return Arrays.<UniqueKey<MessageRecord>>asList(Keys.MESSAGE_PKEY);
    }

    @Override
    public List<ForeignKey<MessageRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MessageRecord, ?>>asList(Keys.MESSAGE__FKMESSAGE3387);
    }

    public Buddys buddys() {
        return new Buddys(this, Keys.MESSAGE__FKMESSAGE3387);
    }

    @Override
    public Message as(String alias) {
        return new Message(DSL.name(alias), this);
    }

    @Override
    public Message as(Name alias) {
        return new Message(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Message rename(String name) {
        return new Message(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Message rename(Name name) {
        return new Message(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, String, Timestamp, Date> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}