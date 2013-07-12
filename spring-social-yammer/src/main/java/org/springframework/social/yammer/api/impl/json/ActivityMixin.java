package org.springframework.social.yammer.api.impl.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created with IntelliJ IDEA.
 * User: jasonkolb
 * Date: 7/11/13
 * Time: 8:44 AM
 * To change this template use File | Settings | File Templates.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
abstract class ActivityMixin {

    @JsonCreator
    ActivityMixin(
            @JsonProperty("action_id") String actionId,
            @JsonProperty("actor_id") String actorId,
            @JsonProperty("object_id") String objectId
    ) {}

}