/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01.implementation;

import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.servicebus.v2017_04_01.EntityStatus;
import com.microsoft.azure.management.servicebus.v2017_04_01.CaptureDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Single item in List or Get Event Hub operation.
 */
@JsonFlatten
public class EventhubInner extends ProxyResource {
    /**
     * Current number of shards on the Event Hub.
     */
    @JsonProperty(value = "properties.partitionIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> partitionIds;

    /**
     * Exact time the Event Hub was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * Number of days to retain the events for this Event Hub, value should be
     * 1 to 7 days.
     */
    @JsonProperty(value = "properties.messageRetentionInDays")
    private Long messageRetentionInDays;

    /**
     * Number of partitions created for the Event Hub, allowed values are from
     * 1 to 32 partitions.
     */
    @JsonProperty(value = "properties.partitionCount")
    private Long partitionCount;

    /**
     * Enumerates the possible values for the status of the Event Hub. Possible
     * values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled',
     * 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'.
     */
    @JsonProperty(value = "properties.status")
    private EntityStatus status;

    /**
     * Properties of capture description.
     */
    @JsonProperty(value = "properties.captureDescription")
    private CaptureDescription captureDescription;

    /**
     * Get current number of shards on the Event Hub.
     *
     * @return the partitionIds value
     */
    public List<String> partitionIds() {
        return this.partitionIds;
    }

    /**
     * Get exact time the Event Hub was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the exact time the message was updated.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get number of days to retain the events for this Event Hub, value should be 1 to 7 days.
     *
     * @return the messageRetentionInDays value
     */
    public Long messageRetentionInDays() {
        return this.messageRetentionInDays;
    }

    /**
     * Set number of days to retain the events for this Event Hub, value should be 1 to 7 days.
     *
     * @param messageRetentionInDays the messageRetentionInDays value to set
     * @return the EventhubInner object itself.
     */
    public EventhubInner withMessageRetentionInDays(Long messageRetentionInDays) {
        this.messageRetentionInDays = messageRetentionInDays;
        return this;
    }

    /**
     * Get number of partitions created for the Event Hub, allowed values are from 1 to 32 partitions.
     *
     * @return the partitionCount value
     */
    public Long partitionCount() {
        return this.partitionCount;
    }

    /**
     * Set number of partitions created for the Event Hub, allowed values are from 1 to 32 partitions.
     *
     * @param partitionCount the partitionCount value to set
     * @return the EventhubInner object itself.
     */
    public EventhubInner withPartitionCount(Long partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * Get enumerates the possible values for the status of the Event Hub. Possible values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'.
     *
     * @return the status value
     */
    public EntityStatus status() {
        return this.status;
    }

    /**
     * Set enumerates the possible values for the status of the Event Hub. Possible values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'.
     *
     * @param status the status value to set
     * @return the EventhubInner object itself.
     */
    public EventhubInner withStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get properties of capture description.
     *
     * @return the captureDescription value
     */
    public CaptureDescription captureDescription() {
        return this.captureDescription;
    }

    /**
     * Set properties of capture description.
     *
     * @param captureDescription the captureDescription value to set
     * @return the EventhubInner object itself.
     */
    public EventhubInner withCaptureDescription(CaptureDescription captureDescription) {
        this.captureDescription = captureDescription;
        return this;
    }

}
