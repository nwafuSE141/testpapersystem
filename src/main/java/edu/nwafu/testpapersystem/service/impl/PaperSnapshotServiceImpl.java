package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.entity.PaperSnapshot;
import edu.nwafu.testpapersystem.domain.mapper.PaperSnapshotMapper;
import edu.nwafu.testpapersystem.service.PaperSnapshotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaperSnapshotServiceImpl extends BaseServiceImpl<PaperSnapshot,Integer> implements PaperSnapshotService {

    @Autowired
    private PaperSnapshotMapper paperSnapshotMapper;

    @Override
    public BaseMapper<PaperSnapshot, Integer> getBaseMapper() {
        return paperSnapshotMapper;
    }
}
