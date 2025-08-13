/*
 * The StudentStatus enum represents the various statuses a student can have.
 * It is used to track the current state of a student in the system.
 *
 * Motivation:
 * This enum is designed to provide a predefined set of constants that represent
 * the possible statuses of a student, ensuring type safety and better readability
 * in the code.
 */
package chamankumar.lld.oop.day02.accessmodifiers.code;

public enum StudentStatus {
    // The student is currently active and participating
    ACTIVE,

    // The student has temporarily paused their participation
    PAUSED,

    // The student has completed their participation
    DONE
}