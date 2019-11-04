/*
 * This file is generated by jOOQ.
 */
package persistence.database.generated.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import persistence.database.generated.tables.Token;


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
public class TokenRecord extends TableRecordImpl<TokenRecord> implements Record2<UUID, Integer> {

    private static final long serialVersionUID = 246495388;

    /**
     * Setter for <code>public.token.token</code>.
     */
    public void setToken(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.token.token</code>.
     */
    public UUID getToken() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.token.loginid</code>.
     */
    public void setLoginid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.token.loginid</code>.
     */
    public Integer getLoginid() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UUID, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Token.TOKEN.TOKEN_;
    }

    @Override
    public Field<Integer> field2() {
        return Token.TOKEN.LOGINID;
    }

    @Override
    public UUID component1() {
        return getToken();
    }

    @Override
    public Integer component2() {
        return getLoginid();
    }

    @Override
    public UUID value1() {
        return getToken();
    }

    @Override
    public Integer value2() {
        return getLoginid();
    }

    @Override
    public TokenRecord value1(UUID value) {
        setToken(value);
        return this;
    }

    @Override
    public TokenRecord value2(Integer value) {
        setLoginid(value);
        return this;
    }

    @Override
    public TokenRecord values(UUID value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TokenRecord
     */
    public TokenRecord() {
        super(Token.TOKEN);
    }

    /**
     * Create a detached, initialised TokenRecord
     */
    public TokenRecord(UUID token, Integer loginid) {
        super(Token.TOKEN);

        set(0, token);
        set(1, loginid);
    }
}
