package Enums;

import java.io.Serializable;

/**
 *
 * @author madsh
 */
public enum RequestType implements Serializable {
    LOGIN,
    LOGOUT,
    CREATE_NEW_USER,
    SEARCH,
    GET_PROFILE,
    UPDATE_PROFILE,
    UPDATE_PASSWORD,
    UPDATE_USERNAME,
    DELETE_ACCOUNT,
    FOLLOW_PROFILE,
    FOLLOW_TRAINING_PROGRAM,
    SEND_BUDDY_REQUEST,
    ACCEPT_BUDDY_REQUEST,
    SET_GOAL,
    SET_STAT,
    REMOVE_STAT,
    SEND_MESSAGE,
    RECEIVE_MESSAGE_HISTORY,
    CREATE_TRAINING_PROGRAM,
    RECEIVE_EXERCISE,
    CREATE_EXERCISE,
    ADD_EXERCISE,
    REMOVE_EXERCISE,
    LOAD_ALL_EXERCISE,
    REMOVE_EXERCISE_FOR_TODAY,
    LOAD_ALL_STATS,
    GET_STATS
}