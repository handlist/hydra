package com.jd.bdp.hydra.mysql.persistent.entity;

import com.jd.bdp.hydra.Annotation;
import com.jd.bdp.hydra.BinaryAnnotation;

/**
 * Date: 13-5-7
 * Time: 上午10:54
 */
public class Absannotation {
    private Integer id;
    private String key;
    private String value;
    private String ip;
    private Integer port;
    private String service;
    private String timestamp;
    private Integer duration;
    private String spanId;
    private String traceId;

    public Absannotation(){

    }

    public Absannotation(BinaryAnnotation binaryAnnotation){
        this.key = binaryAnnotation.getKey();
        this.ip = binaryAnnotation.getHost().getIp();
        this.value = new String(binaryAnnotation.getValue());
        this.port = binaryAnnotation.getHost().getPort();
    }

    public Absannotation(Annotation annotation){
        this.key = annotation.getValue();
        this.timestamp = String.valueOf(annotation.getTimestamp());
        this.duration = annotation.getDuration();
        this.ip = annotation.getHost().getIp();
        this.port = annotation.getHost().getPort();
    }

    @Override
    public String toString() {
        return "Absannotation{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", ip='" + ip + '\'' +
                ", port=" + port +
                ", service='" + service + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", duration=" + duration +
                ", spanId='" + spanId + '\'' +
                ", traceId='" + traceId + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
}