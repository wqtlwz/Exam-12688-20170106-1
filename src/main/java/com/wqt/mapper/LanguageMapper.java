package com.wqt.mapper;

import com.wqt.dto.Language;
import org.apache.ibatis.annotations.Param;

public interface LanguageMapper {
    public Language findById(@Param("languageId") Integer languageId);
}
