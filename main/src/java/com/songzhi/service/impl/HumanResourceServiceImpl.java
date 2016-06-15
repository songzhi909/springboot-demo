package com.songzhi.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.songzhi.service.HumanResourceService;

@Service
public class HumanResourceServiceImpl implements HumanResourceService {
  private final Logger logger = LoggerFactory.getLogger(HumanResourceServiceImpl.class);

  @Override
  public void bookHoliday(Date startDate, Date endDate, String name) {
    this.logger.info("Booking holiday for [{} - {}] for [{}] ", startDate, endDate,
        name);
  }
}
