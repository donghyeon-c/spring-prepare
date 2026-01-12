package com.meta.springprepare.memo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Memo {
    private String username;
    private String title;
    private String conents;
    private Date createAt;
    private Date updatedAt;

    public void writeMemo(){

       }
    }
