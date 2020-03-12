/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.modbus.sunspec.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.openhab.binding.modbus.ModbusBindingConstants;

/**
 * The {@link SunSpecConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Nagy Attila Gábor - Initial contribution
 */
@NonNullByDefault
public class SunSpecConstants {

    private static final String BINDING_ID = ModbusBindingConstants.BINDING_ID;

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_INVERTER_SINGLE_PHASE = new ThingTypeUID(BINDING_ID,
            "inverter-single-phase");

    // Block types
    public static final int COMMON_BLOCK = 1;
    public static final int INVERTER_SINGLE_PHASE = 101;

    /**
     * Map of the supported thing type uids, with their block type id
     */
    public static final Map<Integer, ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = new HashMap<>();
    static {
        SUPPORTED_THING_TYPES_UIDS.put(INVERTER_SINGLE_PHASE, THING_TYPE_INVERTER_SINGLE_PHASE);
    }

    // properties
    public static final String PROPERTY_VENDOR = "vendor";
    public static final String PROPERTY_MODEL = "model";
    public static final String PROPERTY_VERSION = "version";
    public static final String PROPERTY_PHASE_COUNT = "phaseCount";
    public static final String PROPERTY_SERIAL_NUMBER = "serialNumber";
    public static final String PROPERTY_BLOCK_ADDRESS = "blockAddress";
    public static final String PROPERTY_BLOCK_LENGTH = "blockLength";
    public static final String PROPERTY_UNIQUE_ADDRESS = "uniqueAddress";

    // Channel group ids
    public static final String GROUP_DEVICE_INFO = "deviceInformation";
    public static final String GROUP_AC_GENERAL = "acGeneral";

    // List of all Channel ids in device information group
    public static final String CHANNEL_PHASE_CONFIGURATION = "phase-configuration";
    public static final String CHANNEL_CABINET_TEMPERATURE = "cabinet-temperature";
    public static final String CHANNEL_HEATSINK_TEMPERATURE = "heatsink-temperature";
    public static final String CHANNEL_TRANSFORMER_TEMPERATURE = "transformer-temperature";
    public static final String CHANNEL_OTHER_TEMPERATURE = "other-temperature";
    public static final String CHANNEL_STATUS = "status";

    // List of channel ids in AC general group for inverter
    public static final String CHANNEL_AC_TOTAL_CURRENT = "ac-total-current";
    public static final String CHANNEL_AC_POWER = "ac-power";
    public static final String CHANNEL_AC_FREQUENCY = "ac-frequency";
    public static final String CHANNEL_AC_APPARENT_POWER = "ac-apparent-power";
    public static final String CHANNEL_AC_REACTIVE_POWER = "ac-reactive-power";
    public static final String CHANNEL_AC_POWER_FACTOR = "ac-power-factor";
    public static final String CHANNEL_AC_LIFETIME_ENERGY = "ac-lifetime-energy";

    // Expected SunSpec ID This is a magic constant to distinguish SunSpec compatible
    // devices from other modbus devices
    public static final long SUNSPEC_ID = 0x53756e53;
    // Size of SunSpect ID in words
    public static final int SUNSPEC_ID_SIZE = 2;
    // Size of any block header in words
    public static final int MODEL_HEADER_SIZE = 2;
}