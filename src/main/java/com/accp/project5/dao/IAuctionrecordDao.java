package com.accp.project5.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.project5.pojo.Auctionrecord;
import com.accp.project5.vo.AuctionRecordVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IAuctionrecordDao extends BaseMapper<Auctionrecord> {
	public List<AuctionRecordVo> queryList(@Param("id") Integer id);
}
