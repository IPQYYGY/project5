package com.accp.project5.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.project5.pojo.Auction;
import com.accp.project5.vo.AuctionVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IAuctionDao extends BaseMapper<Auction> {
	public List<AuctionVo> queryEndList(@Param("time") Date time);

	public List<AuctionVo> queryStartList(@Param("time") Date time);

	public int delById(@Param("id") Integer id);

}
