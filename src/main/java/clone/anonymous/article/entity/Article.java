package clone.anonymous.article.entity;

import clone.anonymous.accounts.entity.User;
import clone.anonymous.core.entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Table(name = "ARTICLES")
@NoArgsConstructor(access = PROTECTED)
public class Article extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "ARTICLE_ID")
    private Long id;

    // 유저
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    // 업로드 파일들
    @OneToMany(mappedBy = "article")
    private List<UploadFile> uploadFiles = new ArrayList<>();

    // 내용
    private String content;

    // 접근성
    private String accessibility;

    // 댓글 on off
    private Boolean releaseComment;

    // 좋아요 수
    private Long NumberOfLikes;
}

