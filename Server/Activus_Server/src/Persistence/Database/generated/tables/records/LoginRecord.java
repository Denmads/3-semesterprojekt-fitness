/*
 * This file is generated by jOOQ.
 */
package Persistence.Database.generated.tables.records;


import Persistence.Database.generated.tables.Login;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class LoginRecord extends UpdatableRecordImpl<LoginRecord> implements Record4<Integer, String, byte[], byte[]> {

    private static final long serialVersionUID = -1989722636;

    /**
     * Setter for <code>public.login.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.login.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.login.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.login.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.login.hash_password</code>.
     */
    public void setHashPassword(byte... value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.login.hash_password</code>.
     */
    public byte[] getHashPassword() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>public.login.password_salt</code>.
     */
    public void setPasswordSalt(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.login.password_salt</code>.
     */
    public byte[] getPasswordSalt() {
        return (byte[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, byte[], byte[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, byte[], byte[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Login.LOGIN.ID;
    }

    @Override
    public Field<String> field2() {
        return Login.LOGIN.USERNAME;
    }

    @Override
    public Field<byte[]> field3() {
        return Login.LOGIN.HASH_PASSWORD;
    }

    @Override
    public Field<byte[]> field4() {
        return Login.LOGIN.PASSWORD_SALT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUsername();
    }

    @Override
    public byte[] component3() {
        return getHashPassword();
    }

    @Override
    public byte[] component4() {
        return getPasswordSalt();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUsername();
    }

    @Override
    public byte[] value3() {
        return getHashPassword();
    }

    @Override
    public byte[] value4() {
        return getPasswordSalt();
    }

    @Override
    public LoginRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public LoginRecord value2(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public LoginRecord value3(byte... value) {
        setHashPassword(value);
        return this;
    }

    @Override
    public LoginRecord value4(byte... value) {
        setPasswordSalt(value);
        return this;
    }

    @Override
    public LoginRecord values(Integer value1, String value2, byte[] value3, byte[] value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LoginRecord
     */
    public LoginRecord() {
        super(Login.LOGIN);
    }

    /**
     * Create a detached, initialised LoginRecord
     */
    public LoginRecord(Integer id, String username, byte[] hashPassword, byte[] passwordSalt) {
        super(Login.LOGIN);

        set(0, id);
        set(1, username);
        set(2, hashPassword);
        set(3, passwordSalt);
    }
}
