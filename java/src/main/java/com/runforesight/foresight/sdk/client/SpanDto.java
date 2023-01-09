/*
 * Foresight Private REST API
 * \"Foresight Private REST API for clients\"
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: info@runforesight.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.runforesight.foresight.sdk.client;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.runforesight.foresight.sdk.client.AttributeDto;
import com.runforesight.foresight.sdk.client.EventDto;
import com.runforesight.foresight.sdk.client.SpanStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SpanDto
 */
@JsonPropertyOrder({
  SpanDto.JSON_PROPERTY_ATTRIBUTES,
  SpanDto.JSON_PROPERTY_DURATION,
  SpanDto.JSON_PROPERTY_EVENTS,
  SpanDto.JSON_PROPERTY_FINISH_TIME,
  SpanDto.JSON_PROPERTY_KIND,
  SpanDto.JSON_PROPERTY_NAME,
  SpanDto.JSON_PROPERTY_ORGANIZATION_ID,
  SpanDto.JSON_PROPERTY_PARENT_SPAN_ID,
  SpanDto.JSON_PROPERTY_REPO_ID,
  SpanDto.JSON_PROPERTY_SPAN_ID,
  SpanDto.JSON_PROPERTY_START_TIME,
  SpanDto.JSON_PROPERTY_STATUS,
  SpanDto.JSON_PROPERTY_TRACE_ID,
  SpanDto.JSON_PROPERTY_USER_ACCOUNT_ID,
  SpanDto.JSON_PROPERTY_WORKFLOW_RUN_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T13:11:04.618466Z[Etc/UTC]")
public class SpanDto {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private List<AttributeDto> attributes = null;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<EventDto> events = null;

  public static final String JSON_PROPERTY_FINISH_TIME = "finishTime";
  private Long finishTime;

  public static final String JSON_PROPERTY_KIND = "kind";
  private Integer kind;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organizationId";
  private String organizationId;

  public static final String JSON_PROPERTY_PARENT_SPAN_ID = "parentSpanId";
  private String parentSpanId;

  public static final String JSON_PROPERTY_REPO_ID = "repoId";
  private String repoId;

  public static final String JSON_PROPERTY_SPAN_ID = "spanId";
  private String spanId;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private Long startTime;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SpanStatus status;

  public static final String JSON_PROPERTY_TRACE_ID = "traceId";
  private String traceId;

  public static final String JSON_PROPERTY_USER_ACCOUNT_ID = "userAccountId";
  private String userAccountId;

  public static final String JSON_PROPERTY_WORKFLOW_RUN_ID = "workflowRunId";
  private String workflowRunId;

  public SpanDto() {
  }

  public SpanDto attributes(List<AttributeDto> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public SpanDto addAttributesItem(AttributeDto attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AttributeDto> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(List<AttributeDto> attributes) {
    this.attributes = attributes;
  }


  public SpanDto duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public SpanDto events(List<EventDto> events) {
    
    this.events = events;
    return this;
  }

  public SpanDto addEventsItem(EventDto eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EventDto> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvents(List<EventDto> events) {
    this.events = events;
  }


  public SpanDto finishTime(Long finishTime) {
    
    this.finishTime = finishTime;
    return this;
  }

   /**
   * Get finishTime
   * @return finishTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FINISH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFinishTime() {
    return finishTime;
  }


  @JsonProperty(JSON_PROPERTY_FINISH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinishTime(Long finishTime) {
    this.finishTime = finishTime;
  }


  public SpanDto kind(Integer kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKind(Integer kind) {
    this.kind = kind;
  }


  public SpanDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public SpanDto organizationId(String organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationId() {
    return organizationId;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public SpanDto parentSpanId(String parentSpanId) {
    
    this.parentSpanId = parentSpanId;
    return this;
  }

   /**
   * Get parentSpanId
   * @return parentSpanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARENT_SPAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentSpanId() {
    return parentSpanId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_SPAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentSpanId(String parentSpanId) {
    this.parentSpanId = parentSpanId;
  }


  public SpanDto repoId(String repoId) {
    
    this.repoId = repoId;
    return this;
  }

   /**
   * Get repoId
   * @return repoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRepoId() {
    return repoId;
  }


  @JsonProperty(JSON_PROPERTY_REPO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepoId(String repoId) {
    this.repoId = repoId;
  }


  public SpanDto spanId(String spanId) {
    
    this.spanId = spanId;
    return this;
  }

   /**
   * Get spanId
   * @return spanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpanId() {
    return spanId;
  }


  @JsonProperty(JSON_PROPERTY_SPAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpanId(String spanId) {
    this.spanId = spanId;
  }


  public SpanDto startTime(Long startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }


  public SpanDto status(SpanStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SpanStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(SpanStatus status) {
    this.status = status;
  }


  public SpanDto traceId(String traceId) {
    
    this.traceId = traceId;
    return this;
  }

   /**
   * Get traceId
   * @return traceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTraceId() {
    return traceId;
  }


  @JsonProperty(JSON_PROPERTY_TRACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public SpanDto userAccountId(String userAccountId) {
    
    this.userAccountId = userAccountId;
    return this;
  }

   /**
   * Get userAccountId
   * @return userAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserAccountId() {
    return userAccountId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }


  public SpanDto workflowRunId(String workflowRunId) {
    
    this.workflowRunId = workflowRunId;
    return this;
  }

   /**
   * Get workflowRunId
   * @return workflowRunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKFLOW_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWorkflowRunId() {
    return workflowRunId;
  }


  @JsonProperty(JSON_PROPERTY_WORKFLOW_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkflowRunId(String workflowRunId) {
    this.workflowRunId = workflowRunId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanDto spanDto = (SpanDto) o;
    return Objects.equals(this.attributes, spanDto.attributes) &&
        Objects.equals(this.duration, spanDto.duration) &&
        Objects.equals(this.events, spanDto.events) &&
        Objects.equals(this.finishTime, spanDto.finishTime) &&
        Objects.equals(this.kind, spanDto.kind) &&
        Objects.equals(this.name, spanDto.name) &&
        Objects.equals(this.organizationId, spanDto.organizationId) &&
        Objects.equals(this.parentSpanId, spanDto.parentSpanId) &&
        Objects.equals(this.repoId, spanDto.repoId) &&
        Objects.equals(this.spanId, spanDto.spanId) &&
        Objects.equals(this.startTime, spanDto.startTime) &&
        Objects.equals(this.status, spanDto.status) &&
        Objects.equals(this.traceId, spanDto.traceId) &&
        Objects.equals(this.userAccountId, spanDto.userAccountId) &&
        Objects.equals(this.workflowRunId, spanDto.workflowRunId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, duration, events, finishTime, kind, name, organizationId, parentSpanId, repoId, spanId, startTime, status, traceId, userAccountId, workflowRunId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanDto {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    parentSpanId: ").append(toIndentedString(parentSpanId)).append("\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    userAccountId: ").append(toIndentedString(userAccountId)).append("\n");
    sb.append("    workflowRunId: ").append(toIndentedString(workflowRunId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

