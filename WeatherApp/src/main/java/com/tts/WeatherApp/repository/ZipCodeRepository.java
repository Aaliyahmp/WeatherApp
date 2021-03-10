package com.tts.WeatherApp.repository;
import com.tts.WeatherApp.model.ZipCode;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode, Long> {
}
