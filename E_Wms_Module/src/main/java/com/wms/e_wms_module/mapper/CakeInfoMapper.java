package com.wms.e_wms_module.mapper;

import com.wms.e_wms_module.entity.CakeInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CakeInfoMapper {
    @Select("select id,cakename as cakeName,introduce,brand,cakepic as cakePic,cakedatailpic as cakeDetailPic,cakeclassid as cakeClassId,createtime as createTime,modifytime as modifyTime from cakeinfo where cakeclassid = #{cakeClassId}")
    List<CakeInfo> selectCakeInfoByCakeClassId(int cakeClassId);
    @Select("select id,cakename as cakeName,introduce,brand,cakepic as cakePic,cakedatailpic as cakeDetailPic,cakeclassid as cakeClassId,createtime as createTime,modifytime as modifyTime from cakeinfo")
    List<CakeInfo> selectCakeInfo();
}
