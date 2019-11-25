/*
 * This file is generated by jOOQ.
 */
package persistence.database.generated;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import persistence.database.generated.tables.Buddys;
import persistence.database.generated.tables.Exercise;
import persistence.database.generated.tables.ExerciseSet;
import persistence.database.generated.tables.Goal;
import persistence.database.generated.tables.Login;
import persistence.database.generated.tables.Message;
import persistence.database.generated.tables.Profile;
import persistence.database.generated.tables.QuestionForBuddys;
import persistence.database.generated.tables.Scheme;
import persistence.database.generated.tables.SchemeProfile;
import persistence.database.generated.tables.SchemeTrainingProgram;
import persistence.database.generated.tables.Set;
import persistence.database.generated.tables.SetTrainingProgramExercise;
import persistence.database.generated.tables.Stats;
import persistence.database.generated.tables.StatsSet;
import persistence.database.generated.tables.Token;
import persistence.database.generated.tables.TrainingProgram;
import persistence.database.generated.tables.TrainingProgramExercise;
import persistence.database.generated.tables.TraningsHours;
import persistence.database.generated.tables.records.BuddysRecord;
import persistence.database.generated.tables.records.ExerciseRecord;
import persistence.database.generated.tables.records.ExerciseSetRecord;
import persistence.database.generated.tables.records.GoalRecord;
import persistence.database.generated.tables.records.LoginRecord;
import persistence.database.generated.tables.records.MessageRecord;
import persistence.database.generated.tables.records.ProfileRecord;
import persistence.database.generated.tables.records.QuestionForBuddysRecord;
import persistence.database.generated.tables.records.SchemeProfileRecord;
import persistence.database.generated.tables.records.SchemeRecord;
import persistence.database.generated.tables.records.SchemeTrainingProgramRecord;
import persistence.database.generated.tables.records.SetRecord;
import persistence.database.generated.tables.records.SetTrainingProgramExerciseRecord;
import persistence.database.generated.tables.records.StatsRecord;
import persistence.database.generated.tables.records.StatsSetRecord;
import persistence.database.generated.tables.records.TokenRecord;
import persistence.database.generated.tables.records.TrainingProgramExerciseRecord;
import persistence.database.generated.tables.records.TrainingProgramRecord;
import persistence.database.generated.tables.records.TraningsHoursRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ExerciseRecord, Integer> IDENTITY_EXERCISE = Identities0.IDENTITY_EXERCISE;
    public static final Identity<GoalRecord, Integer> IDENTITY_GOAL = Identities0.IDENTITY_GOAL;
    public static final Identity<LoginRecord, Integer> IDENTITY_LOGIN = Identities0.IDENTITY_LOGIN;
    public static final Identity<MessageRecord, Integer> IDENTITY_MESSAGE = Identities0.IDENTITY_MESSAGE;
    public static final Identity<ProfileRecord, Integer> IDENTITY_PROFILE = Identities0.IDENTITY_PROFILE;
    public static final Identity<QuestionForBuddysRecord, Integer> IDENTITY_QUESTION_FOR_BUDDYS = Identities0.IDENTITY_QUESTION_FOR_BUDDYS;
    public static final Identity<SchemeRecord, Integer> IDENTITY_SCHEME = Identities0.IDENTITY_SCHEME;
    public static final Identity<SetRecord, Integer> IDENTITY_SET = Identities0.IDENTITY_SET;
    public static final Identity<StatsRecord, Integer> IDENTITY_STATS = Identities0.IDENTITY_STATS;
    public static final Identity<TrainingProgramRecord, Integer> IDENTITY_TRAINING_PROGRAM = Identities0.IDENTITY_TRAINING_PROGRAM;
    public static final Identity<TraningsHoursRecord, Integer> IDENTITY_TRANINGS_HOURS = Identities0.IDENTITY_TRANINGS_HOURS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BuddysRecord> BUDDYS_PKEY = UniqueKeys0.BUDDYS_PKEY;
    public static final UniqueKey<ExerciseRecord> EXERCISE_PKEY = UniqueKeys0.EXERCISE_PKEY;
    public static final UniqueKey<ExerciseSetRecord> EXERCISE_SET_PKEY = UniqueKeys0.EXERCISE_SET_PKEY;
    public static final UniqueKey<GoalRecord> GOAL_PKEY = UniqueKeys0.GOAL_PKEY;
    public static final UniqueKey<LoginRecord> LOGIN_PKEY = UniqueKeys0.LOGIN_PKEY;
    public static final UniqueKey<MessageRecord> MESSAGE_PKEY = UniqueKeys0.MESSAGE_PKEY;
    public static final UniqueKey<ProfileRecord> PROFILE_PKEY = UniqueKeys0.PROFILE_PKEY;
    public static final UniqueKey<QuestionForBuddysRecord> QUESTION_FOR_BUDDYS_PKEY = UniqueKeys0.QUESTION_FOR_BUDDYS_PKEY;
    public static final UniqueKey<SchemeRecord> SCHEME_PKEY = UniqueKeys0.SCHEME_PKEY;
    public static final UniqueKey<SchemeProfileRecord> SCHEME_PROFILE_PKEY = UniqueKeys0.SCHEME_PROFILE_PKEY;
    public static final UniqueKey<SchemeTrainingProgramRecord> SCHEME_TRAINING_PROGRAM_PKEY = UniqueKeys0.SCHEME_TRAINING_PROGRAM_PKEY;
    public static final UniqueKey<SetRecord> SET_PKEY = UniqueKeys0.SET_PKEY;
    public static final UniqueKey<SetTrainingProgramExerciseRecord> SET_TRAINING_PROGRAM_EXERCISE_PKEY = UniqueKeys0.SET_TRAINING_PROGRAM_EXERCISE_PKEY;
    public static final UniqueKey<StatsRecord> STATS_PKEY = UniqueKeys0.STATS_PKEY;
    public static final UniqueKey<StatsSetRecord> STATS_SET_PKEY = UniqueKeys0.STATS_SET_PKEY;
    public static final UniqueKey<TokenRecord> TOKEN_PKEY = UniqueKeys0.TOKEN_PKEY;
    public static final UniqueKey<TrainingProgramRecord> TRAINING_PROGRAM_PKEY = UniqueKeys0.TRAINING_PROGRAM_PKEY;
    public static final UniqueKey<TrainingProgramExerciseRecord> TRAINING_PROGRAM_EXERCISE_PKEY = UniqueKeys0.TRAINING_PROGRAM_EXERCISE_PKEY;
    public static final UniqueKey<TraningsHoursRecord> TRANINGS_HOURS_PKEY = UniqueKeys0.TRANINGS_HOURS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BuddysRecord, ProfileRecord> BUDDYS__FKBUDDYS967094 = ForeignKeys0.BUDDYS__FKBUDDYS967094;
    public static final ForeignKey<BuddysRecord, ProfileRecord> BUDDYS__FKBUDDYS740159 = ForeignKeys0.BUDDYS__FKBUDDYS740159;
    public static final ForeignKey<ExerciseSetRecord, ExerciseRecord> EXERCISE_SET__FKEXERCISE_S261425 = ForeignKeys0.EXERCISE_SET__FKEXERCISE_S261425;
    public static final ForeignKey<ExerciseSetRecord, SetRecord> EXERCISE_SET__FKEXERCISE_S178541 = ForeignKeys0.EXERCISE_SET__FKEXERCISE_S178541;
    public static final ForeignKey<GoalRecord, ProfileRecord> GOAL__FKGOAL645380 = ForeignKeys0.GOAL__FKGOAL645380;
    public static final ForeignKey<MessageRecord, BuddysRecord> MESSAGE__FKMESSAGE3387 = ForeignKeys0.MESSAGE__FKMESSAGE3387;
    public static final ForeignKey<ProfileRecord, LoginRecord> PROFILE__FKPROFILE488694 = ForeignKeys0.PROFILE__FKPROFILE488694;
    public static final ForeignKey<QuestionForBuddysRecord, ProfileRecord> QUESTION_FOR_BUDDYS__FKQUESTION_F273342 = ForeignKeys0.QUESTION_FOR_BUDDYS__FKQUESTION_F273342;
    public static final ForeignKey<SchemeProfileRecord, SchemeRecord> SCHEME_PROFILE__FKSCHEME_PRO761813 = ForeignKeys0.SCHEME_PROFILE__FKSCHEME_PRO761813;
    public static final ForeignKey<SchemeProfileRecord, ProfileRecord> SCHEME_PROFILE__FKSCHEME_PRO981379 = ForeignKeys0.SCHEME_PROFILE__FKSCHEME_PRO981379;
    public static final ForeignKey<SchemeTrainingProgramRecord, TrainingProgramRecord> SCHEME_TRAINING_PROGRAM__FKSCHEME_TRA889963 = ForeignKeys0.SCHEME_TRAINING_PROGRAM__FKSCHEME_TRA889963;
    public static final ForeignKey<SchemeTrainingProgramRecord, SchemeRecord> SCHEME_TRAINING_PROGRAM__FKSCHEME_TRA313403 = ForeignKeys0.SCHEME_TRAINING_PROGRAM__FKSCHEME_TRA313403;
    public static final ForeignKey<SetTrainingProgramExerciseRecord, SetRecord> SET_TRAINING_PROGRAM_EXERCISE__FKSET_TRAINI607098 = ForeignKeys0.SET_TRAINING_PROGRAM_EXERCISE__FKSET_TRAINI607098;
    public static final ForeignKey<SetTrainingProgramExerciseRecord, TrainingProgramExerciseRecord> SET_TRAINING_PROGRAM_EXERCISE__FKSET_TRAINI326281 = ForeignKeys0.SET_TRAINING_PROGRAM_EXERCISE__FKSET_TRAINI326281;
    public static final ForeignKey<StatsRecord, ProfileRecord> STATS__FKSTATS65934 = ForeignKeys0.STATS__FKSTATS65934;
    public static final ForeignKey<StatsRecord, ExerciseRecord> STATS__FKSTATS911505 = ForeignKeys0.STATS__FKSTATS911505;
    public static final ForeignKey<StatsSetRecord, StatsRecord> STATS_SET__FKSTATS_SET948616 = ForeignKeys0.STATS_SET__FKSTATS_SET948616;
    public static final ForeignKey<StatsSetRecord, SetRecord> STATS_SET__FKSTATS_SET793324 = ForeignKeys0.STATS_SET__FKSTATS_SET793324;
    public static final ForeignKey<TokenRecord, LoginRecord> TOKEN__FKTOKEN86604 = ForeignKeys0.TOKEN__FKTOKEN86604;
    public static final ForeignKey<TrainingProgramRecord, ProfileRecord> TRAINING_PROGRAM__PROFILE_ID = ForeignKeys0.TRAINING_PROGRAM__PROFILE_ID;
    public static final ForeignKey<TrainingProgramExerciseRecord, ExerciseRecord> TRAINING_PROGRAM_EXERCISE__FKTRAINING_P194169 = ForeignKeys0.TRAINING_PROGRAM_EXERCISE__FKTRAINING_P194169;
    public static final ForeignKey<TrainingProgramExerciseRecord, TrainingProgramRecord> TRAINING_PROGRAM_EXERCISE__FKTRAINING_P855275 = ForeignKeys0.TRAINING_PROGRAM_EXERCISE__FKTRAINING_P855275;
    public static final ForeignKey<TraningsHoursRecord, QuestionForBuddysRecord> TRANINGS_HOURS__FKTRANINGS_H999671 = ForeignKeys0.TRANINGS_HOURS__FKTRANINGS_H999671;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ExerciseRecord, Integer> IDENTITY_EXERCISE = Internal.createIdentity(Exercise.EXERCISE, Exercise.EXERCISE.ID);
        public static Identity<GoalRecord, Integer> IDENTITY_GOAL = Internal.createIdentity(Goal.GOAL, Goal.GOAL.ID);
        public static Identity<LoginRecord, Integer> IDENTITY_LOGIN = Internal.createIdentity(Login.LOGIN, Login.LOGIN.ID);
        public static Identity<MessageRecord, Integer> IDENTITY_MESSAGE = Internal.createIdentity(Message.MESSAGE, Message.MESSAGE.ID);
        public static Identity<ProfileRecord, Integer> IDENTITY_PROFILE = Internal.createIdentity(Profile.PROFILE, Profile.PROFILE.ID);
        public static Identity<QuestionForBuddysRecord, Integer> IDENTITY_QUESTION_FOR_BUDDYS = Internal.createIdentity(QuestionForBuddys.QUESTION_FOR_BUDDYS, QuestionForBuddys.QUESTION_FOR_BUDDYS.ID);
        public static Identity<SchemeRecord, Integer> IDENTITY_SCHEME = Internal.createIdentity(Scheme.SCHEME, Scheme.SCHEME.ID);
        public static Identity<SetRecord, Integer> IDENTITY_SET = Internal.createIdentity(Set.SET, Set.SET.ID);
        public static Identity<StatsRecord, Integer> IDENTITY_STATS = Internal.createIdentity(Stats.STATS, Stats.STATS.ID);
        public static Identity<TrainingProgramRecord, Integer> IDENTITY_TRAINING_PROGRAM = Internal.createIdentity(TrainingProgram.TRAINING_PROGRAM, TrainingProgram.TRAINING_PROGRAM.ID);
        public static Identity<TraningsHoursRecord, Integer> IDENTITY_TRANINGS_HOURS = Internal.createIdentity(TraningsHours.TRANINGS_HOURS, TraningsHours.TRANINGS_HOURS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<BuddysRecord> BUDDYS_PKEY = Internal.createUniqueKey(Buddys.BUDDYS, "buddys_pkey", Buddys.BUDDYS.PROFILEID, Buddys.BUDDYS.PROFILEID2);
        public static final UniqueKey<ExerciseRecord> EXERCISE_PKEY = Internal.createUniqueKey(Exercise.EXERCISE, "exercise_pkey", Exercise.EXERCISE.ID);
        public static final UniqueKey<ExerciseSetRecord> EXERCISE_SET_PKEY = Internal.createUniqueKey(ExerciseSet.EXERCISE_SET, "exercise_set_pkey", ExerciseSet.EXERCISE_SET.EXERCISEID, ExerciseSet.EXERCISE_SET.SETID);
        public static final UniqueKey<GoalRecord> GOAL_PKEY = Internal.createUniqueKey(Goal.GOAL, "goal_pkey", Goal.GOAL.ID);
        public static final UniqueKey<LoginRecord> LOGIN_PKEY = Internal.createUniqueKey(Login.LOGIN, "login_pkey", Login.LOGIN.ID);
        public static final UniqueKey<MessageRecord> MESSAGE_PKEY = Internal.createUniqueKey(Message.MESSAGE, "message_pkey", Message.MESSAGE.ID);
        public static final UniqueKey<ProfileRecord> PROFILE_PKEY = Internal.createUniqueKey(Profile.PROFILE, "profile_pkey", Profile.PROFILE.ID);
        public static final UniqueKey<QuestionForBuddysRecord> QUESTION_FOR_BUDDYS_PKEY = Internal.createUniqueKey(QuestionForBuddys.QUESTION_FOR_BUDDYS, "question_for_buddys_pkey", QuestionForBuddys.QUESTION_FOR_BUDDYS.ID);
        public static final UniqueKey<SchemeRecord> SCHEME_PKEY = Internal.createUniqueKey(Scheme.SCHEME, "scheme_pkey", Scheme.SCHEME.ID);
        public static final UniqueKey<SchemeProfileRecord> SCHEME_PROFILE_PKEY = Internal.createUniqueKey(SchemeProfile.SCHEME_PROFILE, "scheme_profile_pkey", SchemeProfile.SCHEME_PROFILE.SCHEDULEID, SchemeProfile.SCHEME_PROFILE.PROFILEID);
        public static final UniqueKey<SchemeTrainingProgramRecord> SCHEME_TRAINING_PROGRAM_PKEY = Internal.createUniqueKey(SchemeTrainingProgram.SCHEME_TRAINING_PROGRAM, "scheme_training_program_pkey", SchemeTrainingProgram.SCHEME_TRAINING_PROGRAM.TRAINING_PROGRAMID, SchemeTrainingProgram.SCHEME_TRAINING_PROGRAM.SCHEDULEID);
        public static final UniqueKey<SetRecord> SET_PKEY = Internal.createUniqueKey(Set.SET, "Set_pkey", Set.SET.ID);
        public static final UniqueKey<SetTrainingProgramExerciseRecord> SET_TRAINING_PROGRAM_EXERCISE_PKEY = Internal.createUniqueKey(SetTrainingProgramExercise.SET_TRAINING_PROGRAM_EXERCISE, "set_training_program_exercise_pkey", SetTrainingProgramExercise.SET_TRAINING_PROGRAM_EXERCISE.SETID, SetTrainingProgramExercise.SET_TRAINING_PROGRAM_EXERCISE.TRAINING_PROGRAM_EXERCISEEXERCISEID, SetTrainingProgramExercise.SET_TRAINING_PROGRAM_EXERCISE.TRAINING_PROGRAM_EXERCISETRAINING_PROGRAMID);
        public static final UniqueKey<StatsRecord> STATS_PKEY = Internal.createUniqueKey(Stats.STATS, "stats_pkey", Stats.STATS.ID);
        public static final UniqueKey<StatsSetRecord> STATS_SET_PKEY = Internal.createUniqueKey(StatsSet.STATS_SET, "stats_set_pkey", StatsSet.STATS_SET.STATSID, StatsSet.STATS_SET.SETID);
        public static final UniqueKey<TokenRecord> TOKEN_PKEY = Internal.createUniqueKey(Token.TOKEN, "token_pkey", Token.TOKEN.LOGINID);
        public static final UniqueKey<TrainingProgramRecord> TRAINING_PROGRAM_PKEY = Internal.createUniqueKey(TrainingProgram.TRAINING_PROGRAM, "training_program_pkey", TrainingProgram.TRAINING_PROGRAM.ID);
        public static final UniqueKey<TrainingProgramExerciseRecord> TRAINING_PROGRAM_EXERCISE_PKEY = Internal.createUniqueKey(TrainingProgramExercise.TRAINING_PROGRAM_EXERCISE, "training_program_exercise_pkey", TrainingProgramExercise.TRAINING_PROGRAM_EXERCISE.EXERCISEID, TrainingProgramExercise.TRAINING_PROGRAM_EXERCISE.TRAINING_PROGRAMID);
        public static final UniqueKey<TraningsHoursRecord> TRANINGS_HOURS_PKEY = Internal.createUniqueKey(TraningsHours.TRANINGS_HOURS, "tranings_hours_pkey", TraningsHours.TRANINGS_HOURS.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BuddysRecord, ProfileRecord> BUDDYS__FKBUDDYS967094 = Internal.createForeignKey(persistence.database.generated.Keys.PROFILE_PKEY, Buddys.BUDDYS, "buddys__fkbuddys967094", Buddys.BUDDYS.PROFILEID);
        public static final ForeignKey<BuddysRecord, ProfileRecord> BUDDYS__FKBUDDYS740159 = Internal.createForeignKey(persistence.database.generated.Keys.PROFILE_PKEY, Buddys.BUDDYS, "buddys__fkbuddys740159", Buddys.BUDDYS.PROFILEID2);
        public static final ForeignKey<ExerciseSetRecord, ExerciseRecord> EXERCISE_SET__FKEXERCISE_S261425 = Internal.createForeignKey(persistence.database.generated.Keys.EXERCISE_PKEY, ExerciseSet.EXERCISE_SET, "exercise_set__fkexercise_s261425", ExerciseSet.EXERCISE_SET.EXERCISEID);
        public static final ForeignKey<ExerciseSetRecord, SetRecord> EXERCISE_SET__FKEXERCISE_S178541 = Internal.createForeignKey(persistence.database.generated.Keys.SET_PKEY, ExerciseSet.EXERCISE_SET, "exercise_set__fkexercise_s178541", ExerciseSet.EXERCISE_SET.SETID);
        public static final ForeignKey<GoalRecord, ProfileRecord> GOAL__FKGOAL645380 = Internal.createForeignKey(persistence.database.generated.Keys.PROFILE_PKEY, Goal.GOAL, "goal__fkgoal645380", Goal.GOAL.PROFILEID);
        public static final ForeignKey<MessageRecord, BuddysRecord> MESSAGE__FKMESSAGE3387 = Internal.createForeignKey(persistence.database.generated.Keys.BUDDYS_PKEY, Message.MESSAGE, "message__fkmessage3387", Message.MESSAGE.SENDER, Message.MESSAGE.RECEIVER);
        public static final ForeignKey<ProfileRecord, LoginRecord> PROFILE__FKPROFILE488694 = Internal.createForeignKey(persistence.database.generated.Keys.LOGIN_PKEY, Profile.PROFILE, "profile__fkprofile488694", Profile.PROFILE.LOGIN_ID);
        public static final ForeignKey<QuestionForBuddysRecord, ProfileRecord> QUESTION_FOR_BUDDYS__FKQUESTION_F273342 = Internal.createForeignKey(persistence.database.generated.Keys.PROFILE_PKEY, QuestionForBuddys.QUESTION_FOR_BUDDYS, "question_for_buddys__fkquestion_f273342", QuestionForBuddys.QUESTION_FOR_BUDDYS.PROFILEID);
        public static final ForeignKey<SchemeProfileRecord, SchemeRecord> SCHEME_PROFILE__FKSCHEME_PRO761813 = Internal.createForeignKey(persistence.database.generated.Keys.SCHEME_PKEY, SchemeProfile.SCHEME_PROFILE, "scheme_profile__fkscheme_pro761813", SchemeProfile.SCHEME_PROFILE.SCHEDULEID);
        public static final ForeignKey<SchemeProfileRecord, ProfileRecord> SCHEME_PROFILE__FKSCHEME_PRO981379 = Internal.createForeignKey(persistence.database.generated.Keys.PROFILE_PKEY, SchemeProfile.SCHEME_PROFILE, "scheme_profile__fkscheme_pro981379", SchemeProfile.SCHEME_PROFILE.PROFILEID);
        public static final ForeignKey<SchemeTrainingProgramRecord, TrainingProgramRecord> SCHEME_TRAINING_PROGRAM__FKSCHEME_TRA889963 = Internal.createForeignKey(persistence.database.generated.Keys.TRAINING_PROGRAM_PKEY, SchemeTrainingProgram.SCHEME_TRAINING_PROGRAM, "scheme_training_program__fkscheme_tra889963", SchemeTrainingProgram.SCHEME_TRAINING_PROGRAM.TRAINING_PROGRAMID);
        public static final ForeignKey<SchemeTrainingProgramRecord, SchemeRecord> SCHEME_TRAINING_PROGRAM__FKSCHEME_TRA313403 = Internal.createForeignKey(persistence.database.generated.Keys.SCHEME_PKEY, SchemeTrainingProgram.SCHEME_TRAINING_PROGRAM, "scheme_training_program__fkscheme_tra313403", SchemeTrainingProgram.SCHEME_TRAINING_PROGRAM.SCHEDULEID);
        public static final ForeignKey<SetTrainingProgramExerciseRecord, SetRecord> SET_TRAINING_PROGRAM_EXERCISE__FKSET_TRAINI607098 = Internal.createForeignKey(persistence.database.generated.Keys.SET_PKEY, SetTrainingProgramExercise.SET_TRAINING_PROGRAM_EXERCISE, "set_training_program_exercise__fkset_traini607098", SetTrainingProgramExercise.SET_TRAINING_PROGRAM_EXERCISE.SETID);
        public static final ForeignKey<SetTrainingProgramExerciseRecord, TrainingProgramExerciseRecord> SET_TRAINING_PROGRAM_EXERCISE__FKSET_TRAINI326281 = Internal.createForeignKey(persistence.database.generated.Keys.TRAINING_PROGRAM_EXERCISE_PKEY, SetTrainingProgramExercise.SET_TRAINING_PROGRAM_EXERCISE, "set_training_program_exercise__fkset_traini326281", SetTrainingProgramExercise.SET_TRAINING_PROGRAM_EXERCISE.TRAINING_PROGRAM_EXERCISEEXERCISEID, SetTrainingProgramExercise.SET_TRAINING_PROGRAM_EXERCISE.TRAINING_PROGRAM_EXERCISETRAINING_PROGRAMID);
        public static final ForeignKey<StatsRecord, ProfileRecord> STATS__FKSTATS65934 = Internal.createForeignKey(persistence.database.generated.Keys.PROFILE_PKEY, Stats.STATS, "stats__fkstats65934", Stats.STATS.PROFILEID);
        public static final ForeignKey<StatsRecord, ExerciseRecord> STATS__FKSTATS911505 = Internal.createForeignKey(persistence.database.generated.Keys.EXERCISE_PKEY, Stats.STATS, "stats__fkstats911505", Stats.STATS.EXERCISEID);
        public static final ForeignKey<StatsSetRecord, StatsRecord> STATS_SET__FKSTATS_SET948616 = Internal.createForeignKey(persistence.database.generated.Keys.STATS_PKEY, StatsSet.STATS_SET, "stats_set__fkstats_set948616", StatsSet.STATS_SET.STATSID);
        public static final ForeignKey<StatsSetRecord, SetRecord> STATS_SET__FKSTATS_SET793324 = Internal.createForeignKey(persistence.database.generated.Keys.SET_PKEY, StatsSet.STATS_SET, "stats_set__fkstats_set793324", StatsSet.STATS_SET.SETID);
        public static final ForeignKey<TokenRecord, LoginRecord> TOKEN__FKTOKEN86604 = Internal.createForeignKey(persistence.database.generated.Keys.LOGIN_PKEY, Token.TOKEN, "token__fktoken86604", Token.TOKEN.LOGINID);
        public static final ForeignKey<TrainingProgramRecord, ProfileRecord> TRAINING_PROGRAM__PROFILE_ID = Internal.createForeignKey(persistence.database.generated.Keys.PROFILE_PKEY, TrainingProgram.TRAINING_PROGRAM, "training_program__profile_id", TrainingProgram.TRAINING_PROGRAM.PROFILE_ID);
        public static final ForeignKey<TrainingProgramExerciseRecord, ExerciseRecord> TRAINING_PROGRAM_EXERCISE__FKTRAINING_P194169 = Internal.createForeignKey(persistence.database.generated.Keys.EXERCISE_PKEY, TrainingProgramExercise.TRAINING_PROGRAM_EXERCISE, "training_program_exercise__fktraining_p194169", TrainingProgramExercise.TRAINING_PROGRAM_EXERCISE.EXERCISEID);
        public static final ForeignKey<TrainingProgramExerciseRecord, TrainingProgramRecord> TRAINING_PROGRAM_EXERCISE__FKTRAINING_P855275 = Internal.createForeignKey(persistence.database.generated.Keys.TRAINING_PROGRAM_PKEY, TrainingProgramExercise.TRAINING_PROGRAM_EXERCISE, "training_program_exercise__fktraining_p855275", TrainingProgramExercise.TRAINING_PROGRAM_EXERCISE.TRAINING_PROGRAMID);
        public static final ForeignKey<TraningsHoursRecord, QuestionForBuddysRecord> TRANINGS_HOURS__FKTRANINGS_H999671 = Internal.createForeignKey(persistence.database.generated.Keys.QUESTION_FOR_BUDDYS_PKEY, TraningsHours.TRANINGS_HOURS, "tranings_hours__fktranings_h999671", TraningsHours.TRANINGS_HOURS.QUESTION_FOR_BUDDYSID);
    }
}
