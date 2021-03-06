package com.youran.generate.pojo.qo;

import com.youran.common.pojo.qo.AbstractQO;
import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotNull;

import static com.youran.generate.pojo.example.MetaManyToManyExample.E_PROJECTID;
import static com.youran.generate.pojo.example.MetaManyToManyExample.N_PROJECTID;


/**
 * 多对多查询参数
 *
 * @author: cbb
 * @date: 2017/7/4
 */
public class MetaManyToManyQO extends AbstractQO {

    @ApiParam(value = N_PROJECTID, example = E_PROJECTID)
    @NotNull
    private Integer projectId;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}
