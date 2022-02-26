package clone.anonymous.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

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

    //== 연관관계 메서드 ==//

    public void addUploadFile(UploadFile uploadFile) {
        this.uploadFiles.add(uploadFile);
        uploadFile.setArticle(this);
    }


}

