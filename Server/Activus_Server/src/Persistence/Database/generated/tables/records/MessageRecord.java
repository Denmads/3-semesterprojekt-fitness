/*
 * This file is generated by jOOQ.
 */
package Persistence.Database.generated.tables.records;


import Persistence.Database.generated.tables.Message;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MessageRecord extends UpdatableRecordImpl<MessageRecord> implements Record6<Integer, Integer, Integer, String, Timestamp, Date> {

    private static final long serialVersionUID = -1968589449;

    /**
     * Setter for <code>public.message.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.message.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.message.sender</code>.
     */
    public void setSender(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.message.sender</code>.
     */
    public Integer getSender() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.message.receiver</code>.
     */
    public void setReceiver(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.message.receiver</code>.
     */
    public Integer getReceiver() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.message.message</code>.
     */
    public void setMessage(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.message.message</code>.
     */
    public String getMessage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.message.time</code>.
     */
    public void setTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.message.time</code>.
     */
    public Timestamp getTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>public.message.date</code>.
     */
    public void setDate(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.message.date</code>.
     */
    public Date getDate() {
        return (Date) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, String, Timestamp, Date> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, Integer, String, Timestamp, Date> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Message.MESSAGE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Message.MESSAGE.SENDER;
    }

    @Override
    public Field<Integer> field3() {
        return Message.MESSAGE.RECEIVER;
    }

    @Override
    public Field<String> field4() {
        return Message.MESSAGE.MESSAGE_;
    }

    @Override
    public Field<Timestamp> field5() {
        return Message.MESSAGE.TIME;
    }

    @Override
    public Field<Date> field6() {
        return Message.MESSAGE.DATE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getSender();
    }

    @Override
    public Integer component3() {
        return getReceiver();
    }

    @Override
    public String component4() {
        return getMessage();
    }

    @Override
    public Timestamp component5() {
        return getTime();
    }

    @Override
    public Date component6() {
        return getDate();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getSender();
    }

    @Override
    public Integer value3() {
        return getReceiver();
    }

    @Override
    public String value4() {
        return getMessage();
    }

    @Override
    public Timestamp value5() {
        return getTime();
    }

    @Override
    public Date value6() {
        return getDate();
    }

    @Override
    public MessageRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public MessageRecord value2(Integer value) {
        setSender(value);
        return this;
    }

    @Override
    public MessageRecord value3(Integer value) {
        setReceiver(value);
        return this;
    }

    @Override
    public MessageRecord value4(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public MessageRecord value5(Timestamp value) {
        setTime(value);
        return this;
    }

    @Override
    public MessageRecord value6(Date value) {
        setDate(value);
        return this;
    }

    @Override
    public MessageRecord values(Integer value1, Integer value2, Integer value3, String value4, Timestamp value5, Date value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MessageRecord
     */
    public MessageRecord() {
        super(Message.MESSAGE);
    }

    /**
     * Create a detached, initialised MessageRecord
     */
    public MessageRecord(Integer id, Integer sender, Integer receiver, String message, Timestamp time, Date date) {
        super(Message.MESSAGE);

        set(0, id);
        set(1, sender);
        set(2, receiver);
        set(3, message);
        set(4, time);
        set(5, date);
    }
}