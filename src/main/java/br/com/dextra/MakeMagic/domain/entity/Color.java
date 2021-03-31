package br.com.dextra.MakeMagic.domain.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Color {

    @ApiModelProperty(value = "name", example = "scarlet")
    private String name;
}
