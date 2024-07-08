//package com.learnway.exam.service;
//
//import com.learnway.exam.domain.Exam;
//import com.learnway.exam.domain.Score;
//import com.learnway.exam.domain.ScoreRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Optional;
//
//@AllArgsConstructor
//@Service
////public class ScoreServiceImpl implements ScoreService{
//
//    private final ScoreRepository scoreRepository;
////    private final ExamService examService;
//
//
//    /*
//    * 시험id로 과목별 점수 페이지 가져옴
//    * */
//    public Page<Score> getScoreListByExam(Long examId, Long memId, Pageable pageable) {
//        return scoreRepository.findByMemIdAndExamId(memId, examId, pageable);
//    }
//
//    //memId로 점수 페이지 가져오기
//    @Override
//    public Page<Score> getScoresByMemId(Long memId, Pageable pageable) {
//        return scoreRepository.findByMemId(memId, pageable);
//    }
//
//    //memId로 점수 리스트 가져오기
//    @Override
//    public List<Score> getScoreListByMemId(Long memId) {
//        return scoreRepository.findAllByMemId(memId);
//    }
//
//    /*
//    * 점수 상세
//    * */
//    @Override
//    public Optional<Score> getScoreById(Long scoreId, Long memId) {
//        return scoreRepository.findByMemIdAndScoreId(memId, scoreId);
//    }
//
//    /*
//    * 점수 입력
//    * */
//    @Override
//    public void writeScore(Score score) {
//        scoreRepository.save(score);
//    }
//
//    /*
//    * 점수 수정
//    * */
//    @Override
//    @Transactional
//    public Optional<Score> updateScore(Score score) {
//        Optional<Score> opScore = scoreRepository.findByMemIdAndScoreId(score.getMemId(), score.getScoreId());
//        opScore.ifPresent(value -> {
//            value.setScoreExScore(score.getScoreExScore());
//            value.setScoreScore(score.getScoreScore());
//            value.setScoreGrade(score.getScoreGrade());
//            value.setScoreExScore(score.getScoreExScore());
//            value.setScoreStdScore(score.getScoreStdScore());
//            value.setSubjectCode(score.getSubjectCode());
//            value.setScoreMemo(score.getScoreMemo());
//            scoreRepository.save(value);
//        });
//        return opScore;
//    }
//
//    /*
//    * 점수 삭제
//    * */
//    @Override
//    public void deleteScore(Long memId ,Long scoreId) {
//        scoreRepository.deleteByMemIdAndExamId(memId, scoreId);
//    }
//
//    @Override
//    public List<Score> getScoreListBySubjectCode(Long memId, String subjectCode) {
//        return List.of();
//    }
//
//    @Override
//    public List<Score> getGrades(Long memId) {
//        return List.of();
//    }
//
//    /*
//    * 시험 유형별 점수 목록
//    * */
////    @Override
////    @Transactional
////    public List<Score> getScoreListByExamType(Long memId, String examType) {
////        List<Exam> list = null;
////        List<Score> scores = null;
////        list = examService.getExamsByExamType(memId, examType);
////        if(!list.isEmpty()){
////            list.stream()
////                    .forEach(exam -> {
////                        Optional<Score> score = scoreRepository.findByMemIdAndExamId(memId, exam.getExamId());
////                        if(score.isPresent()){scores.add(score.get());}
////                    });
////        }
////        return scores;
////    }
////
////    @Override
////    public List<Integer> getAvgScores(Long memId) {
////        return List.of();
////    }
//}
