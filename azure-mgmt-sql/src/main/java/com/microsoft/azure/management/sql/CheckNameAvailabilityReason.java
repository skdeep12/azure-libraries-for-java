/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for CheckNameAvailabilityReason.
 */
public enum CheckNameAvailabilityReason {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value AlreadyExists. */
    ALREADY_EXISTS("AlreadyExists");

    /** The actual serialized value for a CheckNameAvailabilityReason instance. */
    private String value;

    CheckNameAvailabilityReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CheckNameAvailabilityReason instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CheckNameAvailabilityReason object, or null if unable to parse.
     */
    @JsonCreator
    public static CheckNameAvailabilityReason fromString(String value) {
        CheckNameAvailabilityReason[] items = CheckNameAvailabilityReason.values();
        for (CheckNameAvailabilityReason item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}