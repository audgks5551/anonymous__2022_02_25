package clone.anonymous.article.entity;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "UPLOAD_FILE")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UploadFile {

    @Id @GeneratedValue
    @Column(name = "UPLOAD_FILE_ID")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "ARTICLE_ID")
    private Article article;

    // 사용자가 적은 파일 이름
    private String uploadFileName;

    // 저장할 때의 파일 이름
    private String storeFileName;

}
