/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Endpoint settings.
 */
public class EndpointSettingsDTO {
    /**
     * Active Learning settings of the endpoint.
     */
    @JsonProperty(value = "activeLearning")
    private EndpointSettingsDTOActiveLearning activeLearning;

    /**
     * Get the activeLearning value.
     *
     * @return the activeLearning value
     */
    public EndpointSettingsDTOActiveLearning activeLearning() {
        return this.activeLearning;
    }

    /**
     * Set the activeLearning value.
     *
     * @param activeLearning the activeLearning value to set
     * @return the EndpointSettingsDTO object itself.
     */
    public EndpointSettingsDTO withActiveLearning(EndpointSettingsDTOActiveLearning activeLearning) {
        this.activeLearning = activeLearning;
        return this;
    }

}
