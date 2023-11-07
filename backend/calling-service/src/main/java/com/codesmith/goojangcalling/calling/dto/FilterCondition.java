package com.codesmith.goojangcalling.calling.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class FilterCondition {
    private String name;
    private String type;
    private String operator;
    private String value;
}