package com.synisys.spring.project.service;

import com.synisys.spring.project.domain.Reader;

/**
 * @author vahe.marikyan
 * @since 2/13/2016.
 */
public interface ReaderService extends Service<Reader> {

    Reader loadReaderByCardNumber(String cardNumber);
}
